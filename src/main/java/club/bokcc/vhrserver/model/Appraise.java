package club.bokcc.vhrserver.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName appraise
 */
@Data
public class Appraise implements Serializable {
    private Integer id;

    private Integer eid;

    private Date appdate;

    private String appresult;

    private String appcontent;

    private String remark;

    private static final long serialVersionUID = 1L;
}