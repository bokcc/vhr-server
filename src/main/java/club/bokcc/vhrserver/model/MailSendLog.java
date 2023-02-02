package club.bokcc.vhrserver.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName mail_send_log
 */
@Data
public class MailSendLog implements Serializable {
    private String msgid;

    private Integer empid;

    private Integer status;

    private String routekey;

    private String exchange;

    private Integer count;

    private Date trytime;

    private Date createtime;

    private Date updatetime;

    private static final long serialVersionUID = 1L;
}