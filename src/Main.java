public class Main {
    public static void main(String[] args) {

        Author author = new Author("John", "Tolkien");
        Author author1 = new Author("lev", "Tolstoy");

        Book book = new Book("Lord  of the Rings", author, 1954);
        Book book1 = new Book("War and Peace", author1, 1899);

        book.setPublishingYear(1955);
        //System.out.println(author.toString());

        //System.out.println(book.toString());

       // System.out.println(author1.toString());
        //System.out.println(book1.toString());


    }
}