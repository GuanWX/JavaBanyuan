package club.banyuan.homework.cake;


/**
 * @author edz
 * @version 1.0
 * @date 2020/11/23 7:18 下午
 */
public class Main {
    public static void main(String[] args) {
        Cake [] cakes=new Cake[10];
        for (int i = 0; i < cakes.length; i++) {
            if (i%2==1){
                cakes[i]=new OrderCake(i,10, Math.random()*20);
            }else{
                cakes[i]= new ReadyMadeCake(i,12,(int)(Math.random()*20));
            }
        }

        showAllPrice(cakes);
        showReadyMadeCakePrice(cakes);
        highPrice(cakes);
    }

    public static void showAllPrice(Cake[] cakes){
        double res=0;
        for (Cake cake:cakes){
            res+=cake.calcPrice();
        }
        System.out.printf("所有蛋糕的总价是 %.2f\n",res);
    }
    public static void showReadyMadeCakePrice(Cake[] cakes){
        double res = 0;
        double quantity=0;
        ReadyMadeCake readyMadeCake ;
        for (int i =0;i< cakes.length;i++){
            if (i%2==0){
                res+=cakes[i].calcPrice();
                readyMadeCake= (ReadyMadeCake)cakes[i];
                quantity += readyMadeCake.getQuantity();
            }
        }

        System.out.printf("ReadyMadeCake蛋糕的数量总和是 %.2f\n",quantity);
        System.out.printf("ReadyMadeCake蛋糕的总价是 %.2f\n",res);
    }
    public static void highPrice(Cake[] cakes){
        int i =0;
        double price = cakes[i].calcPrice();
        for (int j = 1; j < cakes.length; j++) {
            if (cakes[i].calcPrice()<cakes[j].calcPrice()){
                i=j;
                price = cakes[i].calcPrice();
            }
        }
        System.out.printf("售价最高的蛋糕是%s总价是%.2f,这种蛋糕是按%s卖的",
                cakes[i].toString(),cakes[i].calcPrice(), ((i%2==0)?("数量"):("质量")));
    }
}
