public class Software extends Product {
    private String programmer;
    private String platform;
    private String os;

    //--------------Constructors------------------------
    public Software(){
        super();
    }
    public Software(String code, String description, double price, String programmer, String platform, String os){
        super(code, description, price);
        this.programmer = programmer;
        this.platform = platform;
        this.os = os;
    }
    //------------------------Methods--------------------

    public String toStrin(){
        return super.toString() +
                "programmer:           " + this.programmer + "\n" +
                "platform:             " + this.platform + "\n" +
                "platform:             " + this.platform;
    }
}
