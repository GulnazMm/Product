public class Book extends Product {
    private String avtor;

    public Book(int id, String name, int price, String avtor) {
        super(id, name, price);
        this.avtor = avtor;
    }
}
