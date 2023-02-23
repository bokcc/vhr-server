package club.bokcc.vhrserver.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author : bokkcc
 * @since : 2023.02.23
 */
@Setter
@Getter
public class Meta implements Serializable {
    private Boolean keepalive;
    private Boolean requireAuth;
}
