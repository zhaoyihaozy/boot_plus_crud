package com.zyh.boot_plus_crud.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zyh.boot_plus_crud.domain.Dept;
import org.apache.ibatis.annotations.Mapper;

/**
* @author A
* @description 针对表【dept】的数据库操作Mapper
* @createDate 2021-12-08 13:11:01
* @Entity com.zyh.boot_plus_crud.domain.Dept
*/
@Mapper
public interface DeptMapper extends BaseMapper<Dept> {

}




