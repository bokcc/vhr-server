package com.bokcc.vhrserver.model;

import java.io.Serializable;
import lombok.Data;

/**
 * @TableName sysmsg
 */
@Data
public class Sysmsg implements Serializable {
    private Integer id;

    private Integer mid;

    private Integer type;

    private Integer hrid;

    private Integer state;

    private static final long serialVersionUID = 1L;
}