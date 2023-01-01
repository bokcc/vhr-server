package com.bokcc.vhrserver.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName joblevel
 */
@Data
public class Joblevel implements Serializable {
    private Integer id;

    private String name;

    private Object titlelevel;

    private Date createdate;

    private Integer enabled;

    private static final long serialVersionUID = 1L;
}