package club.banyuan.structure;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/14 3:09 下午
 */
public enum UserType {

    CUSTOMER(0,"客户"),MANAGER(1,"经理");
    private int userType;
    private String userTypeStr;

    UserType(int userType, String userTypeStr) {
        this.userType = userType;
        this.userTypeStr = userTypeStr;
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

    @Override
    public String toString() {
        return "UserType{" +
                "userType=" + userType +
                ", userTypeStr='" + userTypeStr + '\'' +
                '}';
    }
}
