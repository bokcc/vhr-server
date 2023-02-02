package club.bokcc.vhrserver.model;

import java.io.Serializable;
import lombok.Data;

/**
 * @TableName role
 */
@Data
public class Role implements Serializable {
    private Integer id;

    private String name;

    private String namezh;

    private static final long serialVersionUID = 1L;
}