package club.bnayuan.node;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/24 8:22 下午
 */
public class LinkedList {
    private Node head;

    Node findNode(int index){
        if(index<0||index>=size()){
            System.out.print(index+"不合法");
            return null;
        }
        int count = 0;
        Node headTemp = this.head;
        while (headTemp !=null && count++ != index){
            headTemp=headTemp.next;
        }
        return headTemp;
    }
    /**
     * 更新指定下标位置的元素
     *
     * @param index   替换的位置
     * @param element 替换后的元素
     * @return 被替换掉的元素
     */
    Object set(int index, Object element){
        Node res = findNode(index);
        if (res!=null){
            Object temp  = res.object;
            res.object=element;
            return temp;
        }
        return " 重新设定失败";
    }

    /**
     * 根据下标获取元素
     *
     * @param index 下标
     * @return
     */
    Object get(int index){
        Node res =findNode(index);
        if (res!=null){
            return res.object;
        }
        return " 查询失败";
    }

    /**
     * 清空集合中的所有元素
     */
    void clear(){
        this.head = null;
    }

    /**
     * 删除指定位置的元素
     *
     * @param index
     * @return 返回被删除掉的元素的引用，如果传入index不合法，返回null
     */
    Object remove(int index){
        if(index==0 && head!=null){
            Object temp = head.object;
            this.head = head.next;
            return temp;
        }else if (index>0&&index<size()){
            Node res = findNode(index-1);
            Object temp = res.next.object;
            if (res!=null){
                res.next = res.next.next;
                return temp;
            }
        }
        return null;
    }

    /**
     * 查找匹配的元素并删除
     *
     * @param o
     * @return true 被删除的元素存在，并且成功被移除
     */
    boolean remove(Object o){
        int index = 0;
        Node headTemp = this.head;
        while (headTemp !=null && !o.equals(headTemp.object)){
            headTemp = headTemp.next;
            index++;
        }
        Object temp = remove(index);
        if (o.equals(temp)){
            return true;
        }
        return false;
    }

    /**
     * @param o 添加元素
     * @return true 添加成功
     */
    boolean add(Object o){
        if (this.head==null){
            this.head=new Node(o);
            return true;
        }
        Node headTemp = this.head;
        while (headTemp.next!=null){
            headTemp = headTemp.next;
        }
        headTemp.next = new Node(o);
        return true;
    }

    /**
     * @return true 空集合， false 集合中包含元素
     */
    boolean isEmpty(){
        if (head==null){
            return true;
        }
        return false;
    }

    /**
     * @return 集合中元素个数
     */
    int size(){
        int count = 0;
        Node head = this.head;
        while (head!=null && head.object!=null ){
            head=head.next;
            count++;
        }
        return count;
    }

    void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.object+"\t");
            temp=temp.next;
        }
        System.out.println();
    }
}

class Test{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println(list.add(1));
        System.out.println(list.add(2));
        System.out.println(list.add(3));
        System.out.println(list.add(4));
        list.print();


        System.out.println(list.set(0,4));
        System.out.println(list.set(1,3));
        System.out.println(list.set(2,2));
        System.out.println(list.set(3,1));
        System.out.println(list.set(4,0));
        list.print();

        System.out.println(list.get(0));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        System.out.println();

        System.out.println(list.remove(0));
        System.out.println(list.remove(Integer.valueOf(3)));
        list.print();

        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.isEmpty());

        list.add("ASD");
        list.add("qwe");
        list.add("123");
        list.print();
        list.remove("qwe");
        list.print();
    }
}