package club.banyuan.homework.book;

import java.util.*;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/1 7:40 下午
 */
public class Book implements Comparable{
    private String name;
    private double price;
    private String press;
    private String author;

    public Book() {
    }

    public Book(String name, double price, String press, String author) {
        this.name = name;
        this.price = price;
        this.press = press;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", press='" + press + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0 && Objects.equals(name, book.name) && Objects.equals(press, book.press) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, press, author);
    }

    @Override
    public int compareTo(Object o) {
        Book book = (Book) o;
        return this.price>book.getPrice()? 1:-1 ;
    }
}
class TestBook{
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("三国演义",15.5,"教育出版社","罗贯中"));
        books.add(new Book("西游记",39.6,"教育出版社","吴承恩"));
        books.add(new Book("石头记",69.9,"教育出版社","曹雪芹&高鹗"));
        books.add(new Book("java编程 从jdk安装到卸载",9.9,"教育出版社","管文轩"));
        books.add(new Book("黑客攻防 从入门到入狱",20.5,"教育出版社","管文轩"));
//        int length = books.size(),index;
//        Book book;
//        for (int i = 0; i < length; i++) {
//            index = 0;
//            for (int j = 1; j < length-i; j++) {
//                if (books.get(j).getPrice() > books.get(index).getPrice()) {
//                    index = j;
//                }
//            }
//            book = books.get(index);
//            books.remove(index);
//            books.add(book);
//        }
        // 实现集合排序的三种方式，List.sort(new Comparator(){});
        books.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPrice() > o2.getPrice()? -1:1;
            }
        });
        System.out.println(books);
        // 第二种方式，集合中存储的类继承Comparable接口，实现比较方法，在通过 Collections.sort(books);实现排序
        Collections.sort(books);
        System.out.println(books);
        // 第三种在调用Collections.sort(ListName,new Comparator(){});
        Collections.sort(books,new Comparator<Book>(){
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPrice()> o2.getPrice()? -1: 1;
            }
        });
        System.out.println(books);

        Iterator iterator = books.iterator();
    }
}
