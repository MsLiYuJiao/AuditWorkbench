package cn.fcwr.aw.bean;

import javax.persistence.*;
import java.util.Date;

/**
 * 我的文件
 */
@Entity
@Table(name = "myfile")
public class Myfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //文件主键
    private  Integer fileId;

    //文件名
    private  String fileName;

    //文件类型Id
    private  Integer fileType;

    //时间
    private  Date fileDate;

    //信息
    private  String fileMessage;

    //是否可用
    private  Integer whether;

    //用户id
    private  Integer uId;


    private Date creationDate;
    private  String createdBy;
    private  Date modifyDate;
    private  String modifiedBy;



}
