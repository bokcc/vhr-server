package com.bokcc.vhrserver.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName employeeec
 */
@Data
public class Employeeec implements Serializable {
    private Integer id;

    private Integer eid;

    private Date ecdate;

    private String ecreason;

    private Integer ecpoint;

    private Integer ectype;

    private String remark;

    private static final long serialVersionUID = 1L;
}