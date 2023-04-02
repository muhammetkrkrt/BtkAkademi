public class CustomerMenager {
    private BaseLogger logger;

    public CustomerMenager(BaseLogger logger){
        this.logger = logger;
    }
    public void add(){
        System.out.println("Musteri eklendi");
        logger.log("Log mesaji");

    }
}
