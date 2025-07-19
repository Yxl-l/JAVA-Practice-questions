<script setup>
import { onMounted, ref, watch } from "vue"
import {
   queryPageApi 
  } from "@/api/emp"




// 创建dataList，存储表格数据
const dataList = ref([]);


// 创建表单元素
const searchForm = ref({
  name: "",
  gender: "",
  begin: "",
  end: "",
  date: [],
});
// 调整表单绑定的元素信息
// 日期处理（侦听）
watch(()=>searchForm.value.date,(newValue,oldValue)=>{
  if(newValue.length==2){
    searchForm.value.begin = newValue[0]
      searchForm.value.end = newValue[1]
  }else{
    searchForm.value.begin = ""
      searchForm.value.end = ""
  }
}
)
// 分页查询数据
const queryPages = async () => {
  // 远程调用
  let result = await queryPageApi(
    searchForm.value.name,
    searchForm.value.gender,
    searchForm.value.begin,
    searchForm.value.end,
    currentPage.value,
    pageSize.value
  );
  // 将数据绑定到dataList中
  dataList.value = result.data.rows;
  total.value = result.data.total;
}
// 分页  参数：当前页、每页多少条，每次查询，需要将这2参数传入后台
// 总条数数据存储
const total = ref(0)
//当前页
const currentPage = ref(1)
const pageSize = ref(10)
const size = "default"
const disabled = false
const background = true
//每页条数被更改时
const handleSizeChange = (val) =>{
pageSize.value = val
  currentPage.value = 1;
  // 执行搜索
  queryPages();
}
//当前页被更改时
const handleCurrentChange = (val) => {
  currentPage.value = val;
  // 执行搜索
  queryPages();
};

// 点添加   显示弹框
const addShow = () => {
  dialogShow.value = true;
  tips.value = "新增部门";
  // 清空表单数据
empForm.value = {
    username: "",
    name: "",
    gender: "",
    job: "",
    entryDate: "",
    deptId: "",
    phone: "",
    salary: "",
    image: "",
    exprList: [],
  };
  
  
};
//表单显示
const dialogShow = ref(false)
// 创建表单对象，用于弹框数据绑定
const empForm = ref({
  username: "",
  name: "",
  gender: "",
  job: "",
  entryDate: "",
  deptId: "",
  phone: "",
  salary: "",
  image: "",
  exprList: [],
});

// 表单下拉框数据处理   部门（后台查询）、职位、性别
const allDepts = ref([]);
const queryAllDept = async () => {
  let result = await queryAll();
  allDepts.value = result.data;
};

// 3）弹框表单中的图像
// 拷贝上传的表单
//声明token
// const token = ref("");
// //获取token令牌
// //加载localStorage存储的员工登录信息
// const loginUser = localStorage.getItem("loginUser");
// if (loginUser) {
//   token.value = JSON.parse(loginUser).token;
// }
// 创建上传成功后的方法和上传前的校验方法
const handleAvatarSuccess = (response, uploadFile) => {
  // response 上传后，响应的数据
  empForm.value.image = response.data;
};
const beforeAvatarUpload = (rawFile) => {
  if (rawFile.type !== "image/jpeg") {
    ElMessage.error("Avatar picture must be JPG format!");
    return false;
  } else if (rawFile.size / 1024 / 1024 > 2) {
    ElMessage.error("Avatar picture size can not exceed 2MB!");
    return false;
  }
  return true;
};


// 定义校验规则（光标离开后的时间校验）
const rules = ref({
  username: [
    { required: true, message: "请输入用户名", trigger: "blur" },
    {
      min: 2,
      max: 20,
      message: "用户名长度应在2到20个字符之间",
      trigger: "blur",
    },
  ],
  name: [
    { required: true, message: "请输入姓名", trigger: "blur" },
    { min: 2, max: 10, message: "姓名长度应在2到10个字符之间", trigger: "blur" },
  ],
  gender: [{ required: true, message: "请选择性别", trigger: "change" }],
  phone: [
    { required: true, message: "请输入手机号", trigger: "blur" },
    { pattern: /^1\d{10}$/g, message: "请输入有效的手机号", trigger: "blur" },
  ],
});

// 新增工作经历，往empForm.exprList中添加一条工作经历数据
const addExpr = () => {
  empForm.value.exprList.push({
    begin: "",
    end: "",
    company: "",
    job: "",
  });
};
// 删除工作经历，根据索引将empForm.exprList指定的数据删除
const removeExpr = (index) => {
  empForm.value.exprList.splice(index, 1);
};




// 初始化预加载
onMounted(() => {
  // 初始化预加载
  queryPages();
  
});

</script>
<template>
  <div>
     <h2>员工管理</h2>
    <div>
      <!-- 添加按钮 -->
      <el-button type="primary" @click="addShow">添加员工</el-button>
      <el-button type="danger" @click="">批量删除</el-button>
    </div>
    <!-- 提交弹窗 -->
      <!-- 弹框案例 -->
    <el-dialog v-model="dialogShow" :title="tips" width="800" :before-close="handleClose">
      <el-form :model="empForm" :rules="rules" ref="ruleFormRef" label-width="auto">
        <el-row :gutter="10">
          <el-col :span="12">
            <el-form-item label="用户名" prop="username">
              <el-input v-model="empForm.username" />
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="姓名" prop="name">
              <el-input v-model="empForm.name" />
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="性别" prop="gender">
              <el-select v-model="empForm.gender" placeholder="请选择你的性别">
                <el-option label="男" value="1" />
                <el-option label="女" value="2" />
              </el-select>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="手机号" prop="phone">
              <el-input v-model="empForm.phone" />
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="职位">
              <el-select v-model="empForm.job" placeholder="请选择你的职位">
                <el-option label="讲师" value="1" />
                <el-option label="班主任" value="2" />
                <el-option label="咨询师" value="3" />
                <el-option label="其他" value="4" />
              </el-select>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="薪资">
              <el-input v-model="empForm.salary" />
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="所属部门">
              <el-select v-model="empForm.deptId" placeholder="请选择你的职位">
                <el-option
                  v-for="(dept, index) in allDepts"
                  :key="index"
                  :label="dept.name"
                  :value="dept.id"
                />
              </el-select>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="入职日期">
              <el-date-picker
                v-model="empForm.entryDate"
                type="date"
                placeholder="请选择日期"
                :size="size"
                value-format="YYYY-MM-DD"
              />
            </el-form-item>
          </el-col>
          <el-col :span="24">
            <el-form-item label="图像">
              <el-upload
                class="avatar-uploader"
                action="/api/upload"
                :headers="{ token: token }"
                :show-file-list="false"
                :on-success="handleAvatarSuccess"
                :before-upload="beforeAvatarUpload"
              >
                <img v-if="empForm.image" :src="empForm.image" class="avatar" />
                <el-icon v-else class="avatar-uploader-icon">
                  <Plus />
                </el-icon>
              </el-upload>
            </el-form-item>
          </el-col>

          <!-- 添加工作经历 -->
          <el-col :span="24">
            <el-button type="primary" @click="addExpr">新增工作经历</el-button>
          </el-col>
          <el-row v-for="(exp, index) in empForm.exprList" :key="index">
            <el-col :span="10">
              <el-form-item label="时间">
                <el-date-picker
                  v-model="exp.date"
                  type="daterange"
                  range-separator="至"
                  start-placeholder="开始时间"
                  end-placeholder="结束时间"
                  :size="size"
                  value-format="YYYY-MM-DD"
                />
              </el-form-item>
            </el-col>
            <el-col :span="6">
              <el-form-item label="公司">
                <el-input v-model="exp.company" />
              </el-form-item>
            </el-col>
            <el-col :span="6">
              <el-form-item label="职位">
                <el-input v-model="exp.job" />
              </el-form-item>
            </el-col>
            <el-col :span="2">
              <el-button type="warning" @click="removeExpr(index)">删除</el-button>
            </el-col>
          </el-row>
        </el-row>
      </el-form>

      <template #footer>
        <div class="dialog-footer">
          <el-button @click="dialogShow = false">取消</el-button>
          <el-button type="primary" @click="addEmp">提交</el-button>
        </div>
      </template>
    </el-dialog>



     <el-form :inline="true" :model="searchForm" class="姓名">
    <el-form-item label="姓名">
      <el-input v-model="searchForm.name" placeholder="请输入姓名" clearable />
    </el-form-item>
    <el-form-item label="性别">
      <el-select
        v-model="searchForm.gender"
        placeholder="选择性别"
        clearable
      >
        <el-option label="男" value="1" />
        <el-option label="女" value="2" />
      </el-select>
    </el-form-item>
    <el-form-item label="入职时间">
       <div class="block">
      <el-date-picker
        v-model="searchForm.date"
        type="daterange"
        range-separator="To"
        start-placeholder="开始时间"
        end-placeholder="结束时间"
        :size="size"
      />
    </div>
    </el-form-item>
    <el-form-item>
      <el-button type="primary" @click="queryPages">查询</el-button>
    </el-form-item>
    <el-form-item>
      <el-button type="primary" @click="">清空</el-button>
    </el-form-item>
  </el-form>
 <!-- 表格列表数据展示 -->
    <el-table
      :data="dataList"
      style="width: 100%"
     
    >
    
      <el-table-column prop="id" label="id" width="180" />
      <el-table-column prop="username" label="username" width="180" />
      <el-table-column prop="name" label="name" />
      <el-table-column prop="gender" label="gender">
        <template #default="scope">{{ scope.row.gender == 1 ? "男" : "女" }}</template>
      </el-table-column>
      <el-table-column prop="image" label="image">
        <template #default="scope">
          <img :src="scope.row.image" style="height: 50px; width: 50px" />
        </template>
      </el-table-column>
      <el-table-column prop="job" label="job">
        <template #default="scope">{{
          scope.row.job == 1
            ? "讲师"
            : scope.row.job == 2
            ? "班主任"
            : scope.row.job == 3
            ? "咨询师"
            : "其他"
        }}</template>
      </el-table-column>
      <el-table-column prop="salary" label="salary" />
      <el-table-column prop="entryDate" label="entryDate" />
      <el-table-column prop="deptName" label="deptName" />
      <el-table-column fixed="right" label="操作" width="200">
        <template #default="scope">
          <el-button type="primary" size="mini" @click=""
            >编辑</el-button
          >
          <el-button type="danger" size="mini" @click="">删除</el-button>
        </template>
      </el-table-column>
    </el-table>
  <!-- 分页 -->
    <el-pagination
      v-model:current-page="currentPage"
      v-model:page-size="pageSize"
      :page-sizes="[10, 20, 30, 40]"
      :size="size"
      :disabled="disabled"
      :background="background"
      layout="total, sizes, prev, pager, next, jumper"
      :total="total"
      @size-change="handleSizeChange"
      @current-change="handleCurrentChange"
    />






  </div>
 
</template>
<style scoped>
h2 {
  color: #fdd407;
}

.avatar-uploader .avatar {
  width: 178px;
  height: 178px;
  display: block;
}
</style>

<style>
.avatar-uploader .el-upload {
  border: 1px dashed var(--el-border-color);
  border-radius: 6px;
  cursor: pointer;
  position: relative;
  overflow: hidden;
  transition: var(--el-transition-duration-fast);
}

.avatar-uploader .el-upload:hover {
  border-color: var(--el-color-primary);
}

.el-icon.avatar-uploader-icon {
  font-size: 28px;
  color: #8c939d;
  width: 178px;
  height: 178px;
  text-align: center;
}
</style>
<style scoped>
/* 全局透明度设置 */
.el-table,
.el-pagination,
.el-form,
.el-dialog {
  opacity: 0.85;
  background-color: rgba(255, 255, 255, 0.5) !important;
}

/* 表格透明度 */
.el-table {
  --el-table-border-color: rgba(0, 0, 0, 0.1);
  --el-table-header-bg-color: rgba(255, 255, 255, 0.5);
  --el-table-tr-bg-color: rgba(255, 255, 255, 0.5);
}

/* 分页组件透明度 */
.el-pagination {
  --el-bg-color: rgba(255, 255, 255, 0.5);
}

/* 表单透明度 */
.el-form {
  padding: 15px;
  border-radius: 5px;
  background-color: rgba(255, 255, 255, 0.5);
}

/* 弹窗透明度 */
.el-dialog {
  --el-dialog-bg-color: rgba(255, 255, 255, 0.5);
}

/* 按钮透明度 */
.el-button {
  opacity: 0.9;
}

/* 上传组件保持不透明 */
.avatar-uploader {
  opacity: 1;
}

/* 表格图片保持不透明 */
.el-table img {
  opacity: 1;
}
</style>
<style scoped>
/* 全局字体颜色加深 */
.el-table,
.el-pagination,
.el-form,
.el-dialog,
.el-form-item__label,
.el-input__inner,
.el-select__placeholder,
.el-menu {
  color: #333 !important;
  /* 使用深灰色 */
}

/* 表格字体颜色加深 */
.el-table th > .cell,
.el-table td > .cell {
  color: #333 !important;
}

/* 弹窗标题字体颜色 */
.el-dialog__title {
  color: #333 !important;
}

/* 保持原有透明度设置 */
.el-table,
.el-pagination,
.el-form,
.el-dialog {
  opacity: 0.85;
  background-color: rgba(255, 255, 255, 0.5) !important;
}
</style>