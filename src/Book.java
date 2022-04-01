public class Book implements Comparable<Book> {
    private String bookName,writerName;
    private int bookPage,releaseDate;

    Book(String bookName,String writerName,int bookPage,int releaseDate){
        this.bookName = bookName;
        this.writerName = writerName;
        this.bookPage = bookPage;
        this.releaseDate = releaseDate;
    }

    public String getBookName() {
        return bookName;
    }

    public String getWriterName() {
        return writerName;
    }

    public int getBookPage() {
        return bookPage;
    }

    public int getReleaseDate() {
        return releaseDate;
    }
    @Override
    public int compareTo(Book o) {
        return this.getBookName().compareTo(o.getBookName());
    }

}

