package club.banyuan.structure;

import club.banyuan.Tool.Config;

import javax.tools.Tool;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/14 3:05 下午
 */
public class User {
    private int id;
    private String name;
    private String pwd;
    private String pwdConfirm;
    private int userType;
    private String userTypeStr;
    public User() {
    }

    public User(String name, String pwd, int userType, String userTypeStr) {
        this.id = Config.UserCount++;
        this.name = name;
        this.pwd = pwd;
        this.pwdConfirm=pwd;
        this.userType = userType;
        this.userTypeStr = userTypeStr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPwdConfirm() {
        return pwdConfirm;
    }

    public void setPwdConfirm(String pwdConfirm) {
        this.pwdConfirm = pwdConfirm;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public String getUserTypeStr() {
        return userTypeStr;
    }

    public void setUserTypeStr(String userTypeStr) {
        this.userTypeStr = userTypeStr;
    }
}
