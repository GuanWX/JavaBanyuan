package club.banyuan.homework;
import java.util.Arrays;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/24 10:23 上午
 */
public class ArrayList {
    private Object [] objects = new Object[0];
    /**
     * 更新数组指定下标的元素
     *
     * @param index   待更新的元素下标
     * @param element 更新后的元素对象
     * @return 被替换掉的旧对象
     */
    public Object set(int index, Object element) {
        //TODO
        if (objects.length<=index||index<0){
            System.err.println(index+"不合法");
        }else {
            Object temp  = objects[index];
            objects[index] = element;
            return temp;
        }
        return null;
    }

    /**
     * 查询指定位置下标的元素
     *
     * @param index 需要判断index是否合法
     * @return 返回查找到的元素，找不到返回null
     */
    public Object get(int index) {
//TODO
        if (objects.length<=index||index<0){
            System.err.println(index+"不合法");
        }else {
            return objects[index];
        }
        return null;
    }

    /**
     * 清空集合内容
     */
    public void clear() {
//TODO
        objects = new Object[0];
    }

    /**
     * 删除指定下标的元素
     *
     * @param index 元素下标
     * @return 将删除的元素返回，如果下标不合理，返回null
     */
    public Object remove(int index) {
//TODO
        if (objects.length<=index||index<0){
            System.err.println(index+"不合法");
        }else {
            Object[] temp = new Object[objects.length-1];
            Object res = objects[index];
            System.arraycopy(objects, 0, temp, 0, index);
                System.arraycopy(objects, index + 1, temp, index, objects.length - 1 - index);
            objects = temp;
            return res;
        }
        return null;
    }

    /**
     * 查找并删除元素
     *
     * @param o 通过目标元素 equals 方法判断是否匹配，
     *          需要判断o是否为null，如果传入null，则用== 进行比较
     * @return
     */
    public boolean remove(Object o) {
//TODO
        for (int i = 0; i < objects.length; i++) {
            if (o==null || o.equals(objects[i])){
                remove(i);
                return true;
            }
        }
        return false;
    }


    /**
     * 添加一个元素
     *
     * @param o
     * @return 添加成功后返回true 失败返回false
     */
    public boolean add(Object o) {
//TODO
        objects = Arrays.copyOf(objects,objects.length+1);
        objects[objects.length-1] = o;
        return true;
    }

    /**
     * @return 数组中没有元素，返回true
     */
    public boolean isEmpty() {
//TODO
        if (objects.length==0){
            return true;
        }
        return false;
    }

    /**
     * 返回数组中保存的元素个数
     *
     * @return
     */
    public int size() {
        int count = objects.length;
        return count;
    }


    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        System.out.println(arrayList.isEmpty());

        System.out.println(arrayList.remove(1));

        System.out.println(arrayList.remove(Integer.valueOf(5)));

        System.out.println("============");

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        arrayList.set(0, 200);
        System.out.println("+++++++++++++");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        arrayList.clear();
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println(arrayList.isEmpty());
    }
}
