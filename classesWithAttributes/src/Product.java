public class Product {

    //attribute || fields

   private int id;
   private String name;
    private String descrition;
    private double price;
    private int stockAmount;
    private String renk ;
    private String kod ;

    public Product() {
    }

    public Product(String name, String descrition, double price, int stockAmount, String renk) {
        this.name = name;
        this.descrition = descrition;
        this.price = price;
        this.stockAmount = stockAmount;
        this.renk = renk;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrition() {
        return descrition;
    }

    public void setDescrition(String descrition) {
        this.descrition = descrition;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }
}
