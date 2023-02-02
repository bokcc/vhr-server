package club.bokcc.vhrserver.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName employee
 */
@Data
public class Employee implements Serializable {
    private Integer id;

    private String name;

    private String gender;

    private Date birthday;

    private String idcard;

    private Object wedlock;

    private Integer nationid;

    private String nativeplace;

    private Integer politicid;

    private String email;

    private String phone;

    private String address;

    private Integer departmentid;

    private Integer joblevelid;

    private Integer posid;

    private String engageform;

    private Object tiptopdegree;

    private String specialty;

    private String school;

    private Date begindate;

    private Object workstate;

    private String workid;

    private Double contractterm;

    private Date conversiontime;

    private Date notworkdate;

    private Date begincontract;

    private Date endcontract;

    private Integer workage;

    private static final long serialVersionUID = 1L;
}