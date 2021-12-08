package com.zyh.boot_plus_crud.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zyh.boot_plus_crud.domain.Emp;
import com.zyh.boot_plus_crud.domain.Msg;
import com.zyh.boot_plus_crud.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpRestController {

    @Autowired
    EmpService empService;
    @GetMapping("/emps/{pn}")
    public Msg emps(@PathVariable("pn") Integer pn){
        System.out.println(pn);
        Page<Emp> page =  new Page<>(pn, 5);
        IPage<Emp> iPage = empService.page(page);
        return Msg.success().add("ipage", iPage);
    }
}
