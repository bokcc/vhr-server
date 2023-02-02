package club.bokcc.vhrserver.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName employeetrain
 */
@Data
public class Employeetrain implements Serializable {
    private Integer id;

    private Integer eid;

    private Date traindate;

    private String traincontent;

    private String remark;

    private static final long serialVersionUID = 1L;
}