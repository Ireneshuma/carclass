import java.security.PrivateKey;
public class carclass{
      private char model;
      private String color;
    private  int year;
    private  char brand;
    private int quantity;
   private   double price;


carclass(){}
     carclass(char newmodel,char newbrand, String  newcolor,double newprice,int newquantity,int newyear){
    model =newmodel ;
    brand = newbrand;
    color = newcolor;
    price = newprice;
    quantity = newquantity;
    year = newyear;

     }
    public char getModel() {
        return model;
    }

    public char getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setModel(char model) {
        this.model = model;
    }

    public void setBrand(char brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //methods that affect the quantity of the cars available
    void sell(int decrease){
        quantity = this.quantity -= decrease;
    }

    void delivery(int increment){
        quantity=quantity += increment;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}












