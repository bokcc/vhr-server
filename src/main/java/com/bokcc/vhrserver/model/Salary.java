package com.bokcc.vhrserver.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName salary
 */
@Data
public class Salary implements Serializable {
    private Integer id;

    private Integer basicsalary;

    private Integer bonus;

    private Integer lunchsalary;

    private Integer trafficsalary;

    private Integer allsalary;

    private Integer pensionbase;

    private Double pensionper;

    private Date createdate;

    private Integer medicalbase;

    private Double medicalper;

    private Integer accumulationfundbase;

    private Double accumulationfundper;

    private String name;

    private static final long serialVersionUID = 1L;
}