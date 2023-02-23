package club.bokcc.vhrserver.model;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * @author : bokkcc
 * @since : 2023.02.23
 */
@Data
public class Menu implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String url;
    private String path;
    private String component;
    private String name;
    private String iconCls;

    private Meta meta;
    private Integer parentId;
    private Integer enabled;

    private List<Menu> children;
}