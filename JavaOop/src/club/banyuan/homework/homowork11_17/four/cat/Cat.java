package club.banyuan.homework.homowork11_17.four.cat;

import club.banyuan.homework.homowork11_17.four.dog.Dog;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/17 8:43 下午
 */
public class Cat {
    private String variety;
    private String colour;

    public Cat(String variety, String colour) {
        this.variety = variety;
        this.colour = colour;
    }

    public Cat(){

    }
    public String getVariety() {
        return variety;
    }

    public String getInfo(){
        return colour+""+variety;
    }
    public void print(){
        System.out.println(getInfo());
    }
    public void playWith(Dog dog){
        System.out.println(getInfo()+"和"+dog.getInfo()+"一起玩");
    }
}
