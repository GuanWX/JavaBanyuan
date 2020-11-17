package club.banyuan.homework;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/16 7:28 下午
 */
public class StudentTest {
    public static void main(String[] args) {
        Student[] student = new Student[6];

        // 通过构造函数为6名学生赋值
        student[0] = new Student("管文轩",100,"雨花台",
                new subject[]{new subject("001", "数学", 98.5),
                               new subject("002", "语文", 91.5),
                        new subject("003", "物理", 92.5)});
        System.out.println(student[0]);
    }
}
