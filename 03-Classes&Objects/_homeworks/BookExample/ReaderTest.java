public class ReaderTest {
    public static void main(String[] args) {
        Reader reader1 = new Reader();
        reader1.setName("Furkan");
        reader1.setAge(21);
        reader1.setSex('M');

        Reader reader2 = new Reader();
        reader2.setName("Julia");
        reader2.setAge(20);
        reader2.setSex('F');

        Author author1 = new Author();
        author1.setName("J.K. Rowling");

        Author author2 = new Author();
        author2.setName("J.R.R. Tolkien");

        Book book1 = new Book();
        book1.setTitle("Harry Potter - Philosopher Stone");
        book1.setAuthor(author1);
        book1.setPage(223);
        book1.setHardCover(true);
        book1.setType("Fantasy Novel");

        Book book2 = new Book();
        book2.setTitle("The Lord of the Rings - The Two Towers");
        book2.setAuthor(author2);
        book2.setPage(352);
        book2.setHardCover(false);
        book1.setType("Fantasy Novel");

        System.out.println("First book: " + book1.getTitle() + " and its author: " + book1.getAuthor().name);
        System.out.println("Second book: " + book2.getTitle() + " and its author: " + book2.getAuthor().name);
        System.out.println();

        reader1.read(book1,100);
        reader2.read(book2,200);
    }
}
