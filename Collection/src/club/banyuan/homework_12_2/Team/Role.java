package club.banyuan.homework_12_2.Team;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/2 5:26 下午
 */
public enum Role {
    PG("控球后卫"),SG("得分后卫"),SF("小前锋"),PF("大前锋"),C("中场");
    private String des;

    Role() {
    }

    Role(String des) {
        this.des = des;
    }

    public String getDes() {
        return des;
    }
}
