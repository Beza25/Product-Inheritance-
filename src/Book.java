public class Book extends Product{
    private String author;
    private int page;


//-----------------Constructors------------------------
    public Book(){
        super();
    }
    public Book( String code, String description, double price, String author, int page ){
        super (code, description, price);
        this.author = author;
        this.page = page;
    }
    //-----------------------Methods-------------------------

    public String toString(){
        return super.toString() +
                "author:               " + this.author + "\n" +
                "page:                 " + this.page;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }






}
