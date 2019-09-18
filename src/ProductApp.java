public class ProductApp {
    public static void main(String[] args){
      Product.getCode();




        Product p = new Product();

        // public Book( String code, String description, double price, String author, int page )
        Book b1 = new Book ( "00001", "fiction", 523.258, "JK", 687);
        Book b2 = new Book ( "00002", "fiction", 32.897, "PM", 46);
        Book b3 = new Book ( "00003", "fiction", 32.897, "PM", 46);
        //public Software(String code, String description, double price, String programmer, String platform, String os)
        Software s1 = new Software("00004","mac Computer", 25.368, "Ann", "mac", "os" );


        System.out.println(b1.toString());
        System.out.println("count: " + b1.getCount());
        System.out.println("--------------------------------");

        System.out.println(b2.toString());
        System.out.println("count: " + b2.getCount());
        System.out.println("--------------------------------");
        System.out.println(s1.toString());
        System.out.println("count: " + s1.getCount());


    }
}
