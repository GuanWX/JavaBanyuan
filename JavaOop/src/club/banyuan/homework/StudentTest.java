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
        student[0] = new Student("管文轩",001,100,"雨花台");
        student[1] = new Student("陈明",002,1.0,"六合");
        student[2] = new Student("烟囱",003,1.1,"武汉");
        student[3] = new Student("赵影院",004,1.2,"盐城");
        student[4] = new Student("音量红",005,2.3,"无锡");
        student[5] = new Student("黄新锐",006,1.4,"福州");

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

    public static void printStu(Student[] student) {
        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i].getInfo());
        }
    }
}
