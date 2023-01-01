package com.bokcc.vhrserver.model;

import java.io.Serializable;
import lombok.Data;

/**
 * @TableName department
 */
@Data
public class Department implements Serializable {
    private Integer id;

    private String name;

    private Integer parentid;

    private String deppath;

    private Integer enabled;

    private Integer isparent;

    private static final long serialVersionUID = 1L;
}