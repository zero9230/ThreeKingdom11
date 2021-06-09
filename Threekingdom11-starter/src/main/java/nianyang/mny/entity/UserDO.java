package nianyang.mny.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author sikou
 */
public class UserDO implements Serializable {
    /**
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * Database Column Remarks:
     *   用户id
     *
     *
     * @mbg.generated
     */
    @Getter
    @Setter
    private Long userId;

    /**
     * Database Column Remarks:
     *   记录创建时间
     *
     *
     * @mbg.generated
     */
    @Getter
    @Setter
    private Date userGmtCreate;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     *
     * @mbg.generated
     */
    @Getter
    @Setter
    private Date userGmtModified;

    /**
     *
     *
     * @mbg.generated
     */
    @Getter
    @Setter
    private String userName;

    /**
     *
     *
     * @mbg.generated
     */
    @Getter
    @Setter
    private Long userAbilityId;
}