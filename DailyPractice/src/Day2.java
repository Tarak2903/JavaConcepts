import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class BookAlreadyBorrowedException extends Exception{
    BookAlreadyBorrowedException(String msg){
        super(msg);
    }
}
interface Borrowable{
    void borrowBook() throws BookAlreadyBorrowedException;
    void returnBook();
    boolean isAvailable();
}
class Book implements Borrowable{

    int id;
    String title;
    String author;
    String category;
    double price;
    boolean available;

    Book(int id,String title,String author,String category,double price){
        this.id=id;
        this.title=title;
        this.author=author;
        this.category=category;
        this.price=price;
        this.available=true;
    }

    public int getId(){return id;}
    public String getTitle(){return title;}
    public String getAuthor(){return author;}
    double getPrice(){return price;}
    public String getCategory(){return category;}
    public boolean isAvailable(){return available;}


    public void borrowBook() throws BookAlreadyBorrowedException{
        if(!available)throw new BookAlreadyBorrowedException("Book is already booked ");

        else available=false;
    }
    public void returnBook(){
        available=true;
    }
    public boolean equals(Object o){
        if(this==o)return true;

        if(! (o instanceof Book))return false;

        Book b= (Book) o;

        return this.id==b.id;
    }
    public int hashCode(){
        return this.id;
    }

    public String toString(){
         return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", available=" + available +
                '}';

    }


}
class Library <T extends Book>{
    List<T>ls;
    Library(){
        ls=new ArrayList<>();
    }
    void addBook(T book){
        ls.add(book);
    }
    void removeBook(int givenID){
      ls= ls.stream()
                .filter(x->x.getId()!=givenID)
                .collect(Collectors.toList());
    }
    Optional<T> findBookById(int givenId){
        return ls.stream()
                .filter(x->x.getId()==givenId)
                .findFirst();
    }
    List<T> getAllBooks(){
        return ls;
    }


}
public class Day2 {
    void main(){
        Library<Book> library = new Library<>();

        library.addBook(new Book(101, "Java Fundamentals", "James Gosling", "Java", 450));
        library.addBook(new Book(102, "Advanced Java", "Herbert Schildt", "Java", 700));
        library.addBook(new Book(103, "Spring Boot Guide", "Craig Walls", "Java", 850));

        library.addBook(new Book(104, "SQL Mastery", "Kathy Sierra", "Database", 500));
        library.addBook(new Book(105, "Database Systems", "Elmasri", "Database", 950));

        library.addBook(new Book(106, "Machine Learning Basics", "Andrew Ng", "Machine Learning", 1200));
        library.addBook(new Book(107, "Deep Learning", "Ian Goodfellow", "Machine Learning", 1500));

        library.addBook(new Book(108, "Computer Networks", "Kurose", "Networking", 800));
        library.addBook(new Book(109, "Operating Systems", "Galvin", "OS", 900));

        library.addBook(new Book(110, "Linux Internals", "Robert Love", "OS", 1100));


        Map<String,List<Book>>grpByCategory=library.ls.stream()
                .collect(
                        Collectors.groupingBy(
                                Book::getCategory
                        )
                );
        Optional<Book>mostExpensiveBook=library.ls.stream()
                .max((a,b)->{
                    return Double.compare(a.getPrice(),b.getPrice());
                });

        Double avg=library.ls.stream()
                .collect(
                        Collectors.averagingDouble(
                                Book::getPrice
                        )
                );
        List<Book>ls2 = library.ls.stream().
                filter(x->
                        x.available=true)
                .toList();

        library.ls.sort(
                (a,b)->{
                    return Double.compare(b.getPrice(),a.getPrice());
                }
        );

        List<String>books= library.ls.stream()
                .filter(x->x.price>500)
                .map(Book::getTitle)
                .toList();

    }
}

