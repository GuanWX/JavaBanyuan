package club.banyuan.demo;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/16 7:01 下午
 */
public class Hammer {
    private String material = "钛合金";  //
    private String form = "长条";
    private double weigth = 1.2; //kg
    private double length = 30.8; //厘米
    private double price = 1.35; // 价格  将模板的属性隐藏  防止别的工具直接调用修改数据  可能会导致数据安全问题
    private String name = "壁咚锤";  //全局变量

    public void setMaterial(String newMaterial){
        material= newMaterial;
    }

    public void setPrice(double newPrice) {
        if (newPrice < 0 || newPrice > 1000000) {
            System.err.println("价格异常");
        } else {
            price = newPrice;
        }
    }

    public void setWeigth(double newWeight) {
        if (newWeight < 0 || newWeight > 200) {
            System.err.println("质量异常");
        } else {
            weigth = newWeight;
        }
    }

    public void setLength(double newLength) {
        if (newLength < 0 || newLength > 100) {
            System.err.println("长度异常");
        } else {
            length = newLength;
        }

    }

    public void setForm(String newForm) {
        form=newForm;
    }

    public void setName(String newName) {
        name=newName;
    }

    public void qiaoren() {
        String address = "";
        System.out.println("张三使用" + name + "对jax壁咚");
    }

    //锤子显示自身各项属性的行为
    public String getInfo() {
        return "重新创建的锤子对象各项属性为:" +
                "name:" + name + ",form:" + form
                + ",length:" + length + ",material:" + material
                + ",price:" + price + ",weigth:" + weigth;

    }
}

 class Test{
    public static void main(String[] args) {
        Hammer hammer1=new Hammer();
        System.out.println(hammer1.getInfo());
        hammer1.setName("羊角锤");
        System.out.println(hammer1.getInfo());
    }
}
