package club.bnayuan.node;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/24 8:17 下午
 */
public class Node {
    Node next;
    Object object;

    public Node(Object object) {
        this.object = object;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

}
