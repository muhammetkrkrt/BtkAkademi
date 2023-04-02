public class Main {
    public static void main(String[] args) {

        //imlemantas bir class birden fazla interface i implement edebilir..
        //ICustomerDal customerDal = new OracleCustomerDal(); // interface onu implement eden sinifin refaransini tutabilir..
        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        //customerManager.customerDal= new OracleCustomerDal();
        customerManager.add();
    }
}