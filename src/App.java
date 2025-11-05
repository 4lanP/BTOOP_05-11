public class App {
    public static void main(String[] args) {
        Block<Book> bookBlock = new Block<>();
        Block<Phone> phoneBlock = new Block<>();
        Block<Food> foodBlock = new Block<>();

        Book book = new Book("Java Programming", "John Doe", 500);
        Phone phone = new Phone("Samsung", "Galaxy S21", 999.99);
        Food food = new Food("Apple", "2023-12-31", 0.2);

        System.out.println("\nTesting Book Block:");
        bookBlock.displayInfo();
        bookBlock.addItem(book);
        bookBlock.displayInfo();
        Book removedBook = bookBlock.removeItem();
        System.out.println("Removed: " + removedBook);
        bookBlock.displayInfo();

        System.out.println("\nTesting Phone Block:");
        phoneBlock.addItem(phone);
        phoneBlock.displayInfo();
        Phone removedPhone = phoneBlock.removeItem();
        System.out.println("Removed: " + removedPhone);

        System.out.println("\nTesting Food Block:");
        foodBlock.addItem(food);
        foodBlock.displayInfo();

        try {
            foodBlock.addItem(new Food("Orange", "2023-12-31", 0.3));
        } catch (IllegalStateException e) {
            System.out.println("\nError: " + e.getMessage());
        }
    }
}
