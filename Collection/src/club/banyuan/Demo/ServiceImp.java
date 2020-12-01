package club.banyuan.Demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/1 1:57 下午
 */
public class ServiceImp<E> implements Service<E>{
    private Collection<E> collection = new ArrayList<>();

    public ServiceImp() {
    }

    public ServiceImp(Collection<E> collection) {
        this.collection = collection;
    }

    public Collection<E> getCollection() {
        return collection;
    }

    public void setCollection(Collection<E> collection) {
        this.collection = collection;
    }

    @Override
    public void add(E e) {
        collection.add(e);
    }

    @Override
    public E remove(E e) {
//        E[] es = (E[]) collection.toArray();
        E res = null;
//        for (E e1 :es) {
//            if (e1.equals(e)){
//                res = e1;
//                collection.remove(e);
//                break;
//            }
//        }
        return res;
    }

    @Override
    public void clear() {
        collection.clear();
    }

    public void show() {
        Iterator iterator = collection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
