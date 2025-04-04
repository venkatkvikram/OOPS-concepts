class Product {
    private String name;
    private double price;
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    void displayDetails() {
        System.out.println("Product Name : "+name);
        System.out.println("Product Price : "+price);
    }
}

class Electronics extends Product {
    private String category;
    Electronics(String name, double price, String category) {
        super(name, price);
        this.category = category;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("Category : "+category);
    }
}

class Tshirt extends Product {
    private String category;
    Tshirt(String name, double price, String category) {
        super(name, price);
        this.category = category;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("Category : "+category);
    }
}



public class InheritanceRealExample {
    public static void main(String[] args) {
        Electronics electronics = new Electronics("Washing Machine", 25, "Electronics");
        Tshirt tshirt = new Tshirt("Denim", 10, "Clothing");
        electronics.displayDetails();
        tshirt.displayDetails();
    }
}
