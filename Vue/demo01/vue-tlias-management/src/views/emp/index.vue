<script setup>
// 分页查询实现
// 1）在api中创建后端请求的方法，所需参数都是拼接在路径中  /emps?name=张&gender=1&begin=2007-09-01&end=2022-09-01&page=1&pageSize=10
// 2）组件中导入api的方法
// 3）实现远程调用，将数据绑定到dataList中，dataList数据在el-table中展示
//    A:el-table表格
//    B:搜索框
//    C:分页组件

// 导入ref创建变量
import { onMounted, ref, watch } from "vue";
// 导入api方法
import {
  queryPageApi,
  addEmpApi,
  getEmpByIdApi,
  updateEmpById,
  deleteEmpApi,
} from "@/api/emp";
// 导入plus图标
import { Plus } from "@element-plus/icons-vue";

// 导入deptapi
import { queryAll } from "@/api/dept";
// 在文件顶部导入部分添加 ElMessageBox
import { ElMessage, ElMessageBox } from "element-plus";
// 创建dataList，存储表格数据
const dataList = ref([]);

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
};

// 表单搜索
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
watch(
  () => searchForm.value.date,
  (newValue, oldValue) => {
    if (newValue.length == 2) {
      searchForm.value.begin = newValue[0];
      searchForm.value.end = newValue[1];
    } else {
      searchForm.value.begin = "";
      searchForm.value.end = "";
    }
  }
);

// 分页  参数：当前页、每页多少条，每次查询，需要将这2参数传入后台
// 总条数数据存储
const total = ref(0);
//当前页
const currentPage = ref(1);
const pageSize = ref(10);
const size = "default";
const disabled = false;
const background = true;

// val 每页显示的条数
const handleSizeChange = (val) => {
  pageSize.value = val;
  currentPage.value = 1;
  // 执行搜索
  queryPages();
};
// val  当前页
const handleCurrentChange = (val) => {
  currentPage.value = val;
  // 执行搜索
  queryPages();
};

// 1）弹框实现
// 创建变量，用于控制弹框是否显示
const dialogShow = ref(false);
// 弹框标题
const tips = ref("");
// 添加显示弹框
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
  // 表单关联对象实现表单清空以及验证信息清空
  // ruleFormRef.resetFields()
};

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
const token = ref("");
//获取token令牌
//加载localStorage存储的员工登录信息
const loginUser = localStorage.getItem("loginUser");
if (loginUser) {
  token.value = JSON.parse(loginUser).token;
}
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

// 4）弹框表单中的员工工作经历实现
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

// 侦听工作经历变化
watch(
  () => empForm.value.exprList,
  (newValue, oldValue) => {
    empForm.value.exprList.forEach((item, index) => {
      if (item.date) {
        //item.begin=newValue[index].date[0]   //item.date[0]
        //item.end=newValue[index].date[1]     //item.date[1]
        item.begin = item.date[0]; //item.date[0]
        item.end = item.date[1]; //item.date[1]
      }
    });
  },
  { deep: true }
);

// 5）表单校验实现
// 关联表单对象
const ruleFormRef = ref(null);

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

// 提交表单校验
const addEmp = async () => {
  ruleFormRef.value.validate(async (valid) => {
    if (valid) {
      //校验通过
      let res;
      if (empForm.value.id) {
        //存在ID, 修改
        res = await updateEmpById(empForm.value);
      } else {
        //不存在ID, 新增
        res = await addEmpApi(empForm.value);
      }
      // 判断结果
      if (res.code) {
        //操作成功，则刷新界面（重新获取员工列表），关闭弹框
        dialogShow.value = false;
        // 刷新界面
        queryPages();
        // 提示
        ElMessage.success("操作成功！");
      } else {
        ElMessage.error("操作失败！");
      }
    }
  });
};

//修改回显
//根据ID查询员工信息
const queryEmpById = async (id) => {
  //远程调用
  let result = await getEmpByIdApi(id);
  empForm.value = result.data;

  empForm.value.exprList.forEach((item, index) => {
    item.date = [];
    item.date.push(item.begin);
    item.date.push(item.end);
  });
  //弹窗
  dialogShow.value = true;
};
// 点击修改按钮触发
const update = async (id) => {
  queryById(id);
};
//定义批量删除的id数组
const selectedIds = ref([]);
//处理复选框选择变化的函数，selection是被选择的行对象
const handleSelectionChange = (selection) => {
  console.log("选中的数据:", selection); // 调试用
  const ids = selection.map((item) => item.id);
  selectedIds.value = ids;
  console.log("转换后的IDs:", selectedIds.value); // 调试用
};
//批量删除
const deleteByIds = async () => {
  //弹出一个确认框, 如果确认, 就删除;
  ElMessageBox.confirm("确定删除选中员工吗?", "提示", {
    confirmButtonText: "确定",
    cancelButtonText: "取消",
    type: "warning",
  }).then(async () => {
    // 删除员工

    const res = await deleteEmpApi(selectedIds.value);
    if (res.code) {
      ElMessage.success(`删除成功`);
      queryPages(); //刷新界面
    } else {
      ElMessage.error(res.msg);
    }
  });
};

// 6）添加员工保存实现
// 在api中创建保存员工的方法
// 导入api的方法
// 新增员工的函数中，调用api方法  addEmpApi
// 操作成功，则刷新界面（重新获取员工列表），关闭弹框
// 操作失败，提示错误信息

// 新增员工
// 1）弹框实现
// 2）弹框表单实现
// 3）弹框表单中的图像
// 4）弹框表单中的员工工作经历实现
// 5）表单校验实现
// 6）添加员工保存实现

// 初始化预加载
onMounted(() => {
  // 初始化预加载
  queryPages();
  queryAllDept();
});
</script>
<template>
  <div>
    <h2>员工管理</h2>
    <div>
      <!-- 添加按钮 -->
      <el-button type="primary" @click="addShow">添加员工</el-button>
      <el-button type="danger" @click="deleteByIds">批量删除</el-button>
    </div>
    <br />
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

    <!-- 搜索表单 -->
    <el-form :inline="true" :model="searchForm" class="demo-form-inline">
      <el-form-item label="姓名">
        <el-input v-model="searchForm.name" placeholder="请输入姓名" clearable />
      </el-form-item>
      <el-form-item label="性别">
        <el-select v-model="searchForm.gender" placeholder="请选择性别" clearable>
          <el-option label="男" value="1" />
          <el-option label="女" value="2" />
        </el-select>
      </el-form-item>
      <el-form-item label="入职时间">
        <el-date-picker
          v-model="searchForm.date"
          type="daterange"
          range-separator="至"
          start-placeholder="开始时间"
          end-placeholder="结束时间"
          :size="size"
          value-format="YYYY-MM-DD"
        />
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="queryPages">查询</el-button>
      </el-form-item>
    </el-form>

    <!-- 表格列表数据展示 -->
    <el-table
      :data="dataList"
      style="width: 100%"
      @selection-change="handleSelectionChange"
    >
      <el-table-column type="selection" width="55" />
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
          <el-button type="primary" size="mini" @click="queryEmpById(scope.row.id)"
            >编辑</el-button
          >
          <el-button type="danger" size="mini" @click="">删除</el-button>
        </template>
      </el-table-column>
    </el-table>

    <!-- 
    分页组件
    currentPage:当前页
    pageSize：每页显示条数
    size：大小（样式）
    disabled：是否禁用  boolean
    background：是否添加背景色 boolean
    handleSizeChange：每页大小发生变化
    handleCurrentChange：当前页发生变化
    -->
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
