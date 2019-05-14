package cn.fcwr.aw.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * 部门表
 */
@Entity
@Table(name = "department")
public class Department  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //部门id
    private  Integer id;

    //部门名称
    private  String name;

    //部门成立时间
    private  Date createDate;

    //上级部门id
    private  Integer superiorId;

    private Date creationDate;
    private  String createdBy;
    private  Date modifyDate;
    private  String modifiedBy;
    @OneToMany(fetch = FetchType.LAZY,
            targetEntity = User.class,
            mappedBy = "department")
    private List<User> Users = new ArrayList<>();

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createDate=" + createDate +
                ", superiorId=" + superiorId +
                ", creationDate=" + creationDate +
                ", createdBy='" + createdBy + '\'' +
                ", modifyDate=" + modifyDate +
                ", modifiedBy='" + modifiedBy + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNname() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getSuperiorId() {
        return superiorId;
    }

    public void setSuperiorId(Integer superiorId) {
        this.superiorId = superiorId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }


    public Department() {

    }

    public Department(String name, Date createDate, Integer superiorId, Date creationDate, String createdBy, Date modifyDate, String modifiedBy) {

        this.name = name;
        this.createDate = createDate;
        this.superiorId = superiorId;
        this.creationDate = creationDate;
        this.createdBy = createdBy;
        this.modifyDate = modifyDate;
        this.modifiedBy = modifiedBy;
    }
}
