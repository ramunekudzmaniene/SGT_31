package OOP;

public class CallingBook {
    public static void main(String[] args) {

        //Creating Book class object
        Book book1 = new Book();
        //book1.printBookInfo();

        book1.setTitle("Java");
        book1.setAuthor("Karlis");
        book1.setNumberOfPages(10);

        book1.printBookInfo();

        Book book2 = new Book();
        book2.setTitle("Java2");
        book2.setAuthor("Karlis");
        book2.setNumberOfPages(200);

        book2.printBookInfo();

    }

}
