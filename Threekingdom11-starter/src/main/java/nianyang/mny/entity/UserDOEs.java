package nianyang.mny.entity;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author sikou
 * @date 2021/01/30
 */
@Document(indexName = "user",type="user")
public class UserDOEs {
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
    @Id
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
