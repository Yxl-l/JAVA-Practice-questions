<script setup>
import { getGoodListApi } from '@/api/good';
import { onMounted, ref } from 'vue';


const goodList = ref([])

const getGoodList = async()=>{
    const result = await getGoodListApi()
    goodList.value = result
}

const defaultProps = {
  children: 'ziList',
  label: 'name',
}

onMounted(()=>{
    getGoodList()
})


</script>

<template>
<el-tree :data="goodList" :props="defaultProps" />
</template>
