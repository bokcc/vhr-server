package com.bokcc.vhrserver.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName oplog
 */
@Data
public class Oplog implements Serializable {
    private Integer id;

    private Date adddate;

    private String operate;

    private Integer hrid;

    private static final long serialVersionUID = 1L;
}