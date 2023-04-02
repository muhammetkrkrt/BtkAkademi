public class Main {
    public static void main(String[] args) {

        Product product = new Product();

        product.setName("Laptop");
        product.setId(1)  ;
        product.setDescrition("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);

        System.out.println(product.getName());
        Product product1 = new Product("Monster","tulpar",5000,3,"Siyah");
        System.out.println(product1.getName());

        ProductMenager productMenager = new ProductMenager();
        productMenager.add(product);
    }
}