package club.bokcc.vhrserver.model;

import java.io.Serializable;
import lombok.Data;

/**
 * @TableName menu_role
 */
@Data
public class MenuRole implements Serializable {
    private Integer id;

    private Integer mid;

    private Integer rid;

    private static final long serialVersionUID = 1L;
}