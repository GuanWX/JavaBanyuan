package club.banyuan.Enum;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/30 6:45 下午
 */
public enum Weekday {
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
    public boolean isWeekday(){
        return !isHoliday();
    }
    public boolean isHoliday(){
        if (this.name().equals("SATURDAY")||this.name().equals("SUNDAY")){
            return true;
        }
        return false;
    }
}
class TestEnum{
    public static void main(String[] args) {
        System.out.println("周六是节假日吗？"+Weekday.SATURDAY.isHoliday());
        for (Weekday weekday :Weekday.values()) {
            if (!weekday.isWeekday()){
                System.out.println(weekday+" is holiday");
            }else {
                System.out.println(weekday + " is weekday");
            }
        }

        System.out.println("\n\n");
        Weekday sat = Weekday.SATURDAY;
        for (Weekday weekday :Weekday.values()){
            System.out.println(weekday.compareTo(sat));
        }
    }
}
