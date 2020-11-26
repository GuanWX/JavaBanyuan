package club.bnayuan.node;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/25 9:19 上午
 */
public class LinkeTwoSide {
    NodeTwoSide head;
    NodeTwoSide end;

    /** 添加元素*/
    public void add( Object o){
        if (this.head==null){
            this.head=new NodeTwoSide(o);
            this.end=this.head;
        }else {
            this.end.next=new NodeTwoSide(this.end,o);
            this.end=this.end.next;
        }
    }

    /**
     * 根据下标位置查找节点
     */
    NodeTwoSide findNode(int index) {
        int count =0,length = size();
        if (index<0||index>=length){
            return null;
        }
        NodeTwoSide temp;
        if (index * 2 < length) {
            temp = this.head;
            while(count++!=index){
                temp=temp.next;
            }
        }else {
            temp = this.end;
            while (index!=(length-count++-1)){
                temp=temp.pre;
            }
        }
        return temp;
    }

    /** 删除指定位置的元素*/
    public boolean remove(int index) {
        if (index==0){
            this.head=this.head.next;
            this.head.pre=null;
            return true;
        }else if (index==size()-1){
            this.end=this.end.pre;
            this.end.next=null;
            return true;
        }
        NodeTwoSide temp =findNode(index);
        if (temp!=null){
            temp.pre.next=temp.next;
            temp.next.pre=temp.pre;
            return true;
        }
        return false;
    }

    /** 删除指定内容的元素*/
    public boolean remove(Object o){
        int time = size()/2+1;
        NodeTwoSide tempHead = this.head;
        NodeTwoSide tempEnd = this.end;
        for (int i = 0; i < time; i++) {
            if (o.equals(tempHead.object)){
                return remove(i);
            }
            if (o.equals(tempEnd.object)){
                return remove(size()-i-1);
            }
            tempHead=tempHead.next;
            tempEnd=tempEnd.pre;
        }
        return false;
    }

    /** 修改指定下标的元素内容*/
    public Object set(int index , Object o){
        NodeTwoSide temp=findNode(index);
        Object res = null;
        if (temp!=null){
            res=temp.object;
            temp.object=o;
        }
        return res;
    }

    /**清楚链表 */
    public void clear(){
        this.head=null;
        this.end=null;
    }

    /**
     * @return true 空集合， false 集合中包含元素
     */
    public boolean isEmpty(){
        if (this.head==null){
            return true;
        }
        return false;
    }

    public void print(){
        NodeTwoSide temp = this.head;
        while(temp!=null){
            System.out.println(temp.object);
            temp=temp.next;
        }
    }

    public int size(){
        int count =0;
        NodeTwoSide temp = this.head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
}
class TestNodeTwoSide{
    public static void main(String[] args) {
        LinkeTwoSide linkeTwoSide = new LinkeTwoSide();
        linkeTwoSide.add("第一项");
        linkeTwoSide.add('A');
        linkeTwoSide.add(1);
        linkeTwoSide.add(4.5);
        linkeTwoSide.print();

        System.out.println(linkeTwoSide.set(0,"ASDF"));
        System.out.println(linkeTwoSide.set(5,"QWER"));
        linkeTwoSide.print();
        System.out.println(linkeTwoSide.isEmpty());
        linkeTwoSide.clear();
        System.out.println(linkeTwoSide.isEmpty());


    }
}
