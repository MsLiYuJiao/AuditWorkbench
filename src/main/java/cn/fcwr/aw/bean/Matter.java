package cn.fcwr.aw.bean;

import javax.persistence.*;
import java.util.Date;

/**
 *  事项表
 */
@Entity
@Table(name = "matter")
public class Matter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //事项主键
    private  Integer mId;

    //事项
    private  String matter;

    //发送人
    private  Integer senderUId;

    //处理人
    private  Integer dealingUId;

    //发送时间
    private  Date senderDate;

    //处理时间
    private  Date dealingDate;

    //处理操作
    private  String processing;

    //处理意见
    private  String opinions;

    //是否处理
    private  Integer whether;

    private Date creationDate;
    private  String createdBy;
    private  Date modifyDate;
    private  String modifiedBy;

}
