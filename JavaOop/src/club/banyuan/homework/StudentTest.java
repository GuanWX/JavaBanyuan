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
        student[0] = new Student("管文轩", 1,100,"雨花台");
        student[1] = new Student("陈明", 2,1.0,"六合");
        student[2] = new Student("烟囱",3,1.1,"武汉");
        student[3] = new Student("赵影院",4,1.2,"盐城");
        student[4] = new Student("音量红",5,2.3,"无锡");
        student[5] = new Student("黄新锐",6,1.4,"福州");

        //排序，并输出结果
        sortScore(student);
        printStu(student);
        System.out.println();

        // 修改一位学生的分数，比较排序前后的区别
        student[0].setStuScore(0);
        System.out.println();
        printStu(student);
        System.out.println();
        sortScore(student);
        printStu(student);

    }
    // 根据得分对学生进行排名
    public static void sortScore(Student[] student){
        Student temp;
        for (int i = 0; i < student.length-1; i++) {
            for (int j = 0; j < student.length-i-1; j++) {
                if (student[j].getStuScore()<student[j+1].getStuScore()) {
                    temp = student[j];
                    student[j]=student[j+1];
                    student[j+1]=temp;
                }
            }
        }
    }

    // 将所有学生的信息打印输出。
    public static void printStu(Student[] student) {
        for (Student value : student) {
            System.out.println(value.getInfo());
        }
    }
}
