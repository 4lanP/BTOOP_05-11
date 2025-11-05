public class Food {
    private String name;
    private String expiryDate;
    private double weight;

    public Food(String name, String expiryDate, double weight) {
        this.name = name;
        this.expiryDate = expiryDate;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", weight=" + weight +
                '}';
    }
}