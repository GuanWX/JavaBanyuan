package club.banyuan.Enum;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/30 7:07 下午
 */
public enum Season {
    SPRING,SUMMER,AUTUMN,WINTER;
    public void getMonthRange(){
        Season season = this;
        switch (season){
            case SPRING:
                System.out.println("3-5");break;
            case SUMMER:
                System.out.println("6-8");break;
            case AUTUMN:
                System.out.println("9-11");break;
            case WINTER:
                System.out.println("12-2");break;
        }
    }

    public static void main(String[] args) {
        for (Season season :Season.values()) {
            season.getMonthRange();
        }
    }
}
