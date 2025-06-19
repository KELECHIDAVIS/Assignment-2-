import java.util.List;

public class Course {
    private int code ;
    private List<Book> book;

    public Course(int code , List<Book> book){
        this.code = code;
        this.book = book;
    }
}
