package com.bokcc.vhrserver.model;

import java.io.Serializable;
import lombok.Data;

/**
 * @TableName menu
 */
@Data
public class Menu implements Serializable {
    private Integer id;

    private String url;

    private String path;

    private String component;

    private String name;

    private String iconcls;

    private Integer keepalive;

    private Integer requireauth;

    private Integer parentid;

    private Integer enabled;

    private static final long serialVersionUID = 1L;
}