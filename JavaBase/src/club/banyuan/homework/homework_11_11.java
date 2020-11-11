package club.banyuan.homework;

import java.util.Scanner;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/11 7:35 下午
 */
public class homework_11_11 {
    public static void main(String[] args) {
        int[] arr ={13,26,-3,4,54,26,37,18,69,-10};
        boolean flag;

        System.out.println("第一题");
        printArray(arr);
        System.out.println("双参数正序排序：");
        sortArray(arr,true);
        printArray(arr);
        System.out.println("双参数倒序排序：");
        sortArray(arr,false);
        printArray(arr);
        System.out.println("单参数正序排序：");
        sortArray(arr);
        printArray(arr);

        System.out.println("第四题");
        System.out.println("4*5="+multiply(4,5));
        System.out.println("-3*12="+multiply(-3,12));
        System.out.println("7*-9="+multiply(7,-9));
        System.out.println("0*9="+multiply(0,9));
        System.out.println("18*0="+multiply(18,0));

        System.out.println("第五题");
        System.out.print("请输入分钟数：");
        Scanner scanner = new Scanner(System.in);
        long minute = scanner.nextLong();
        convert(minute);

        System.out.println("第六题");
        changeMethod();

        System.out.println("第七题");
        int[] arr2 ={1,1,1,2,2,4,4,-1,1};
        int[] res = filtArray(arr2);
        System.out.println("去重完成后：");
        for (int i: res){
            System.out.print(i+"\t");
        }
        System.out.println();
    }

    public static void printArray(int[] arr) {
        /*
        * 将数组输出
        * */
        for (int i = 0; i < arr.length ; i++) {
            System.out.print("["+i+"]="+arr[i]+"\t");
            if (0 == (i + 1) % 5) {
                System.out.println();
            }
        }
        System.out.println();;
    }

    public static void sortArray(int[] arr, boolean flag) {
        /*
        * 根据输入的布尔值flag的值决定进行升序排序还是降序排序
        * */
        int temp;
        if (true == flag) {
            //升序冒泡排序
            for (int i = 0; i < arr.length-1; i++) {
                for (int j = 0; j < arr.length-i-1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        temp= arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
        }else{
            // 降序冒泡排序
            for (int i = 0; i < arr.length-1; i++) {
                for (int j = 0; j < arr.length-i-1; j++) {
                    if (arr[j] < arr[j + 1]) {
                        temp= arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
        }
    }

    public static void sortArray(int[] arr) {
        /*
         * 方法重载，单参数直接进行升序冒泡排序
         * */
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static int multiply(int x, int y) {
        /*
        * 不使用*计算乘法的思路是通过移位，
        * 例如：12*5
        * 5=2^2+2^0
        * 可以通过 12>>2+12 完成计算
        * 针对负数，将其全部变换成正数进行计算，
        * 存在0则可以直接返回0
        *
        * */
        int sign = 1;
        int re = 0;
        if (x < 0) {
            x = -x;
            sign = -sign;
        }
        if (y < 0) {
            y = -y;
            sign = -sign;
        }
        if (x == 0 || y == 0) {
            return 0;
        }
        while(0!=y){
            if(1==(y&1)){
                // 当前的最后一位如果为1，那么就加上一个X，如果是0，就不加X
                re=re+x;
            }
            //为方便下一次计算，将y的最后一位移除，同时，将X右移一位
            x=x<<1;
            y=y>>1;
        }
        if (sign < 0) {
            return -re;
        } else {
            return re;
        }
    }

    public static void convert(long minute){
        if (minute < 0) {
            System.out.println("您的输入有误！");
            return;
        }
        int day = (int) minute/(24*60);
        int year = (int) day/365;
        day = day%365;
        if (year > 0 && day>0) {
            System.out.println(minute+"分钟是"+year+"年"+day+"天");
        } else if (year > 0 && day == 0) {
            System.out.println(minute + "分钟是" + year + "年");
        } else if (year == 0 && day > 0) {
            System.out.println(minute+"分钟是"+day+"天");
        }else {
            System.out.println(minute+"分钟不足1天");
        }
    }

    public static void changeMethod(){
        /*
        * i,j,k分别代表三种硬币的个数
        * 通过i和j两个变量控制循环，k的值等于100-i-j，
        * 当三种硬币面值的和等于1.5元时打印i,j,k,统计值加1.
        * */
        int i, j, k, sum = 0;
        for ( i = 1; i < 99; i++) {
            for ( j = 1; j < 99-i; j++) {
                k=100-i-j;
                if(150==(i+2*j+5*k)){
                    System.out.println("面值1分的 "+i+" 枚，面值2分的 "+j+" 枚，面值5分的 "+k+" 枚");
                    sum++;
                }
            }
        }
        System.out.println("一共有"+sum+"种方案");
    }

    public static int [] filtArray(int[] arr){
        System.out.println("去重前：");
        for (int i: arr){
            System.out.print(i+"\t");
        }
        System.out.println();
        boolean flag;
        int[] arrCopy = new int[arr.length];
        int arrCopyPo = 0;
        for (int i = 0; i < arr.length; i++) {
            flag = true;
            for (int j = 0; j < arrCopyPo; j++) {
                if (arr[i] == arrCopy[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                arrCopy[arrCopyPo++]=arr[i];
            }
        }
        int[] res = new int[arrCopyPo];
        for (int i = 0; i < res.length; i++) {
            res[i]=arrCopy[i];
        }
        return res;
    }

}
