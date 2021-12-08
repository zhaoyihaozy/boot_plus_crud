package com.zyh.boot_plus_crud.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName emp
 */
@TableName(value ="emp")
@Data
public class Emp implements Serializable {
    /**
     * 员工编号
     */
    @TableId(value = "empno", type = IdType.AUTO)
    private Integer empno;

    /**
     * 姓名
     */
    @TableField(value = "ename")
    private String ename;

    /**
     * 工作
     */
    @TableField(value = "job")
    private String job;

    /**
     * 上级
     */
    @TableField(value = "mgr")
    private Integer mgr;

    /**
     * 入职时间
     */
    @TableField(value = "hiredate")
    private Date hiredate;

    /**
     * 工资
     */
    @TableField(value = "sal")
    private Double sal;

    /**
     * 津贴
     */
    @TableField(value = "comm")
    private Double comm;

    /**
     * 部门
     */
    @TableField(value = "deptno")
    private Integer deptno;

    /**
     * 邮箱
     */
    @TableField(value = "email")
    private String email;

    /**
     * 性别
     */
    @TableField(value = "gender")
    private String gender;

    /**
     * 当前系统时间
     */
    @TableField(value = "update_datetime")
    private Date update_datetime;

    /**
     * version
     */
    @TableField(value = "version")
    private Integer version;

    /**
     * 逻辑删除
     */
    @TableField(value = "deleted")
    private Integer deleted;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}