package com.zyh.boot_plus_crud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zyh.boot_plus_crud.domain.Emp;
import com.zyh.boot_plus_crud.service.EmpService;
import com.zyh.boot_plus_crud.mapper.EmpMapper;
import org.springframework.stereotype.Service;

/**
* @author A
* @description 针对表【emp】的数据库操作Service实现
* @createDate 2021-12-08 13:11:01
*/
@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp>
    implements EmpService{

}




