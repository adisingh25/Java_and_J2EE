package Q4_Swings_Validation;

public class Item {
    String name;
    int id;
    double price;
    public Item(int id,String name,double p) {
        this.name = name;
        this.id = id;
        this.price = p;
    }
    public String toString() {
        return "Name: "+name+" price:"+price;
    }
}
