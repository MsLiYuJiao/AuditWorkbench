package cn.fcwr.aw.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户表
 */
@Entity//实体类
@Table(name = "user")//指定表
public class User implements Serializable {
    //主键
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    //姓名
    private  String name;

    //邮箱
    private  String email;

    //电话
    private  String telephone;

    //状态(0:非正常 1:正常)
    private  String state;

    //岗位
    private  String position;

    //人员资质
    private  String qualifications;

    //权限(0:管理员 1:普通用户)
    private  Integer jurisdiction;

    //rtx
    private  String rtx;

    private Date creationDate;
    private  String createdBy;
    private  Date modifyDate;
    private  String modifiedBy;

    @ManyToOne(fetch = FetchType.LAZY,
            targetEntity = Roles.class)
    @JoinColumn(name = "rId",referencedColumnName = "id")
    @JsonIgnoreProperties( value={"hibernateLazyInitializer","handler"})
    private Roles roles;

    @ManyToOne(fetch = FetchType.LAZY,
            targetEntity = Department.class)
    @JoinColumn(name = "dId",referencedColumnName = "id")
    @JsonIgnoreProperties( value={"hibernateLazyInitializer","handler"})
    private Department department;

    @ManyToOne(fetch = FetchType.LAZY,
            targetEntity = Account.class)
    @JoinColumn(name = "aId",referencedColumnName = "id")
    @JsonIgnoreProperties( value={"hibernateLazyInitializer","handler"})
    private Account account;


    @Override
    public String toString() {
        return "User{" +
                "Id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", state='" + state + '\'' +
                ", position='" + position + '\'' +
                ", qualifications='" + qualifications + '\'' +
                ", jurisdiction=" + jurisdiction +
                ", rtx='" + rtx + '\'' +
                ", creationDate=" + creationDate +
                ", createdBy='" + createdBy + '\'' +
                ", modifyDate=" + modifyDate +
                ", modifiedBy='" + modifiedBy + '\'' +
                ", roles=" + roles +
                ", department=" + department +
                ", account=" + account +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public Integer getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(Integer jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public String getRtx() {
        return rtx;
    }

    public void setRtx(String rtx) {
        this.rtx = rtx;
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

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public User() {

    }

    public User(String name, String email, String telephone, String state, String position, String qualifications, Integer jurisdiction, String rtx, Date creationDate, String createdBy, Date modifyDate, String modifiedBy, Roles roles, Department department, Account account) {

        this.name = name;
        this.email = email;
        this.telephone = telephone;
        this.state = state;
        this.position = position;
        this.qualifications = qualifications;
        this.jurisdiction = jurisdiction;
        this.rtx = rtx;
        this.creationDate = creationDate;
        this.createdBy = createdBy;
        this.modifyDate = modifyDate;
        this.modifiedBy = modifiedBy;
        this.roles = roles;
        this.department = department;
        this.account = account;
    }
}
