package club.bokcc.vhrserver.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName position
 */
@Data
public class Position implements Serializable {
    private Integer id;

    private String name;

    private Date createdate;

    private Integer enabled;

    private static final long serialVersionUID = 1L;
}