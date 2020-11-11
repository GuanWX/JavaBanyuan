package club.banyuan.sort;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/11 7:14 下午
 */
public class BubbleSort {
    public static void main(String[] args) {
        // 冒泡排序
        int[] arr ={34,5,621,452,13,551,12};
        printArray(arr);
        sortArray(arr);
        printArray(arr);
    }

    public static void sortArray(int[] arr) {
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
    public static void printArray(int[] arr){
        for (int i : arr){
            System.out.printf(i+"\t");
        }
        System.out.println();
    }
}
