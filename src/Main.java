import java.util.Comparator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet();

        books.add(new Book("Hayvan Çiftliği","George Orwel",134,1975));
        books.add(new Book("Kürk Mantolu Madonna","Sabahattin Ali",257,1985));
        books.add(new Book("Fareler Ve İnsanlar","John Steinbeck",167,1978));
        books.add(new Book("Keloğlan Oruç Peşinde","Merve Gülcemal",87,2019));
        books.add(new Book("Aylak Adam","Yusuf Atılgan",111,2010));

        for (Book i: books){
            System.out.println(i.getBookName());
        }


        System.out.println("*************** Baş Harfe Göre Sıralandı ***************");

        TreeSet<Book> bookSetPageNum = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getBookPage()-o2.getBookPage();
            }
        });


        bookSetPageNum.add(new Book("Hayvan Çiftliği","George Orwel",134,1975));
        bookSetPageNum.add(new Book("Kürk Mantolu Madonna","Sabahattin Ali",257,1985));
        bookSetPageNum.add(new Book("Fareler Ve İnsanlar","John Steinbeck",167,1978));
        bookSetPageNum.add(new Book("Keloğlan Oruç Peşinde","Merve Gülcemal",87,2019));
        bookSetPageNum.add(new Book("Aylak Adam","Yusuf Atılgan",111,2010));

        for (Book i:bookSetPageNum) {
            System.out.println("Kitap: "+ i.getBookName()+" Sayfa Sayısı: "+i.getBookPage());
        }

    }
}
