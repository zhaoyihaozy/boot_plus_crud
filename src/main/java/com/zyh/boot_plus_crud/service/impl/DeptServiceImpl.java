package com.zyh.boot_plus_crud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zyh.boot_plus_crud.domain.Dept;
import com.zyh.boot_plus_crud.service.DeptService;
import com.zyh.boot_plus_crud.mapper.DeptMapper;
import org.springframework.stereotype.Service;

/**
* @author A
* @description 针对表【dept】的数据库操作Service实现
* @createDate 2021-12-08 13:11:01
*/
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept>
    implements DeptService{

}




