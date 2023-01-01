package com.bokcc.vhrserver.model;

import java.io.Serializable;
import lombok.Data;

/**
 * @TableName nation
 */
@Data
public class Nation implements Serializable {
    private Integer id;

    private String name;

    private static final long serialVersionUID = 1L;
}