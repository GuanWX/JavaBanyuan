package club.bnayuan.node;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/25 9:17 上午
 */
public class NodeTwoSide {
    NodeTwoSide pre;
    Object object;
    NodeTwoSide next;

    public NodeTwoSide(NodeTwoSide pre, Object object, NodeTwoSide next) {
        this.pre = pre;
        this.object = object;
        this.next = next;
    }

    public NodeTwoSide(NodeTwoSide pre, Object object) {
        this.pre = pre;
        this.object = object;
    }

    public NodeTwoSide(Object object) {
        this.object = object;
    }

    public NodeTwoSide() {
    }

}
