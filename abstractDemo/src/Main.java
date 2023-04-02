public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();
//        customerManager.baseDatebaseManager = new OracleDatabaseManager(); // burada oracle databaseden veri ceker...
//        customerManager.baseDatebaseManager = new SqlServerDatabaseManager(); // burada sql server databaseden veri ceker...
        customerManager.baseDatebaseManager = new MySqlDatabaseManager();
        customerManager.getCustomers();

    }
}