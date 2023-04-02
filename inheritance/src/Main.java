public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer();
        Employee employee = new Employee();

        EmployeeMenager employeeMenager = new EmployeeMenager();
        CustomerMenager customerMenager = new CustomerMenager();

        employeeMenager.list(); // burada personelMenager sinifindadaki metodu cagirabildik kalitim sayesinde
        customerMenager.add(); // ayni sekilde customerMenager sinifida personMenager sinifindan extends edildigi icin
                                // oradaki metods kullana bilir
        


    }
}