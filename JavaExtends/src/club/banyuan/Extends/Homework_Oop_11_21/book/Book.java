package club.banyuan.Extends.Homework_Oop_11_21.book;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/21 10:06 上午
 */
public class Book {
    private String title;
    private int pageNum=200;

    public Book(String title, int pageNum) {
        int Num = 200;
        if (pageNum>=200){
            Num = pageNum;
        }else{
            System.err.println("书的页数不能少于200页，使用默认值200");
        }
        this.title = title;
        this.pageNum = Num;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        int Num = 200;
        if (pageNum>=200){
            Num = pageNum;
        }else{
            System.err.println("书籍的页数不能小于200页，修改《"+this.title+"》信息失败,使用默认值200");
        }
        this.pageNum=Num;
    }


    public String detail() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pageNum=" + pageNum +
                '}';
    }
}
