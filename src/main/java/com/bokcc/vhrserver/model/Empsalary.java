package com.bokcc.vhrserver.model;

import java.io.Serializable;
import lombok.Data;

/**
 * @TableName empsalary
 */
@Data
public class Empsalary implements Serializable {
    private Integer id;

    private Integer eid;

    private Integer sid;

    private static final long serialVersionUID = 1L;
}