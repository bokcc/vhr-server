package club.bokcc.vhrserver.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName msgcontent
 */
@Data
public class Msgcontent implements Serializable {
    private Integer id;

    private String title;

    private String message;

    private Date createdate;

    private static final long serialVersionUID = 1L;
}