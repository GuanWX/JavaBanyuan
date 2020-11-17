package club.banyuan.homework.homowork11_17.four.dog;

import club.banyuan.homework.homowork11_17.four.cat.Cat;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/17 8:37 下午
 */
public class Dog {
    private String variety;
    private int IQ;

    public Dog(String variety, int IQ) {
        this.variety = variety;
        this.IQ = IQ;
    }

    public Dog() {
    }

    public String getInfo(){
        String str ="";
        if (IQ<20) {
            str="傻";
        }else if (IQ>=20&&IQ<=80){
            str="普通的";
        }else {
            str="聪明的";
        }
        return str+variety;
    }
    public void printInfo(){
        System.out.println(getInfo());
    }
    public void playWith(Cat cat){
        System.out.println(variety+"和"+cat.getVariety()+"一起玩");
    }
}
