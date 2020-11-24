package club.banyuan.Extends.Homework_Oop_11_21.dog;


/**
 * @author edz
 * @version 1.0
 * @date 2020/11/21 10:24 上午
 */
public class Dog {
    //创建一个狗类:Dog
    //为Dog添加yao(咬)方法,实现狗咬的功能
    //如果是yao(),什么都不传，则是“汪汪叫”
    //如果是yao(String str),则是“咬骨头，好香啊”
    //如果是yao(Person p),传入的是人类，如果人的性别为男，则“扑上去撕咬”，如果人的性别是女

    public void yao(){
        System.out.println("汪汪叫");
    }
    public void yao(String str){
        System.out.println("咬骨头，好香啊");
    }
    public void yao (Person p){
        if(p.getSex() == '女'){
            System.out.println("算了，下次一定咬她");
        }else{
            System.out.println("扑上去撕咬");
        }
    }
}
