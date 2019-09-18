
import java.text.NumberFormat;
public class Product {
    private static String code;
    private String description;
    private double price;
    private static int count = 0;

    public Product(){
        code = "";
        description = "";
        price = 0.0;
    }

    public Product(String code, String description, double price){
        this.code = code;
        this.description = description;
        this.price = price;
    }

    /**
     * This method uses NumberFormat to format the price to 2 decimal places
     * The trick is .getCurrencyInstance() already has a format of to 2 decimal places
     * @return String form of the price with 2 decimal places
     */
    public String getFormattedPrice(Double price) {
            NumberFormat nf = NumberFormat.getCurrencyInstance();
            return nf.format(price);


    }

    public static int getCount(){
        if(code != null){
            count++;
        }
        return count;
    }
    public String toString(){
        return  "Code:                 " + this.code +"\n" +
                "Description:          " + this.description + "\n" +
                "Price:                " + getFormattedPrice(getPrice())  + "\n";
    }

    public static String getCode() {
        System.out.println("I have a code.");
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void setCount(int count) {
        Product.count = count;
    }
}
