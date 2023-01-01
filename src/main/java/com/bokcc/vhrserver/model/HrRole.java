package com.bokcc.vhrserver.model;

import java.io.Serializable;
import lombok.Data;

/**
 * @TableName hr_role
 */
@Data
public class HrRole implements Serializable {
    private Integer id;

    private Integer hrid;

    private Integer rid;

    private static final long serialVersionUID = 1L;
}