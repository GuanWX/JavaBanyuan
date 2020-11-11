package club.banyuan.demo;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/11 6:00 下午
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int [] arr = new int[5];
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
            System.out.println(arr[i]);
        }
//        arr[0]的地址空间
        System.out.println(arr);
        //arr 和 arr2 的地址空间是一样的，修改arr2相当于修改arr
        int[] arr2 = arr;
        arr2[0]=10;
        System.out.println(arr[0]);
        //增强for循环
        for (int i : arr){
            System.out.println(i);
        }
        // 数组的集中赋值方式
        int [] arr3 = new int[] {1,2,3,4,5,6};

        int index= 3;
        int[] arr4 = new int[index];

        int [] arr5 ={4,3,2,1};

        // 多维数组的定义
        int[][] ints1 = new int[5][5];
        for (int i =0;i<ints1.length;i++){
            for (int j =0;j<ints1.length;j++){
                ints1[i][j]=(int)(Math.random()*50);
            }
        }
        for (int[] i : ints1) {
            for (int j:i){
                System.out.print(j+"\t");
            }
            System.out.println();
        }

        int[][] ints2 = new int[3][];
        ints2[0]=new int[3];
        ints2[1]=new int[4];
        ints2[2]=new int[5];

        for (int i =0;i<ints2.length;i++){
            for (int j =0;j<ints2[i].length;j++){
                ints2[i][j]=(int)(Math.random()*50);
            }
        }
        for (int[] i : ints2) {
            for (int j:i){
                System.out.print(j+"\t");
            }
            System.out.println();
        }


    }
}
