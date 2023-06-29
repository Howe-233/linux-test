package entry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Howe
 * @version 2021.2
 * @date 2023/6/19 10:42
 */

public class UserInfo {
    private Integer id;
    private String name;
    private String userName;
    private String password;
    private String tel;
    private String address;
    private Integer sex;
    private String avatar;
    private Date createTime;
    private Integer status;

    public UserInfo() {


    }

    public UserInfo(Integer id, String name, String userName, String password, String tel, String address, Integer sex, String avatar, Date createTime, Integer status) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.tel = tel;
        this.address = address;
        this.sex = sex;
        this.avatar = avatar;
        this.createTime = createTime;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
