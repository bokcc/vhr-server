package com.bokcc.vhrserver.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName employeeremove
 */
@Data
public class Employeeremove implements Serializable {
    private Integer id;

    private Integer eid;

    private Integer afterdepid;

    private Integer afterjobid;

    private Date removedate;

    private String reason;

    private String remark;

    private static final long serialVersionUID = 1L;
}