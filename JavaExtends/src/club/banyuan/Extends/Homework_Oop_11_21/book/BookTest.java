package club.banyuan.Extends.Homework_Oop_11_21.book;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/21 10:18 上午
 */
public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("金瓶梅",300);
        Book book2 = new Book("庆余年",180);

        System.out.println(book1.detail());
        System.out.println(book2.detail());

        book1.setPageNum(100);
        System.out.println(book1.detail());
    }
}
