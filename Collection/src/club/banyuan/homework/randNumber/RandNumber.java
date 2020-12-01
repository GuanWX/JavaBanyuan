package club.banyuan.homework.randNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;


/**
 * @author edz
 * @version 1.0
 * @date 2020/12/1 7:02 下午
 */
public class RandNumber{
    ArrayList <Integer> arrayList= new ArrayList<>();

    public void productNumber() throws RuntimeException{
        Random random = new Random();
        Integer a = random.nextInt(100)+1;
        for (int i =0;i<arrayList.size();i++) {
            if (a.equals(arrayList.get(i))){
                throw new ObjectRepeatException();
            }
        }
        arrayList.add(a);
    }
    public void show(){
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+"\t");
        }
        System.out.println();
    }
    public void sort(){
        arrayList.sort(null);
    }
}
class Test{
    public static void main(String[] args) {
        RandNumber randNumber = new RandNumber();
        for (int i = 0; i < 10; i++) {
            try{
                randNumber.productNumber();
            }catch (ObjectRepeatException e){
                i--;
            }
        }
        randNumber.show();
        randNumber.sort();

        randNumber.show();
    }
}