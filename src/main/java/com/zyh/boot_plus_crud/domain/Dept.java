package com.zyh.boot_plus_crud.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName dept
 */
@TableName(value ="dept")
@Data
public class Dept implements Serializable {
    /**
     * 部门编号
     */
    @TableId(value = "deptno")
    private Integer deptno;

    /**
     * 部门名称
     */
    @TableField(value = "dname")
    private String dname;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}