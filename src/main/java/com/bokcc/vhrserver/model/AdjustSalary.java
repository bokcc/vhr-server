package com.bokcc.vhrserver.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author xiaowang
 * @TableName adjustsalary
 */
@Data
public class AdjustSalary implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private Integer eid;
    private Date asdate;
    private Integer beforesalary;
    private Integer aftersalary;
    private String reason;
    private String remark;
}