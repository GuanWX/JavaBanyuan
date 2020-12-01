package club.banyuan.Demo;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/1 1:56 下午
 */
public interface Service<E>{
    void add(E e);
    E remove(E e);
    void clear();
}
