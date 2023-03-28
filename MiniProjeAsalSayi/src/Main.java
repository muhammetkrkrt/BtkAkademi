public class Main {
    public static void main(String[] args) {

       int number = 1 ;

         boolean check = false ;

         if(number == 1){                                       // tum kontrolleri yapmamiz lazim
             System.out.println("Sayi asal degildir");
             return;                                        // Bu komut bagli bulundugunuz methodu bitirir

         }                                                // Defencesify programin koruyucu proglama icin tum herseye bakilmasi gerekir
         if(number< 1 ){
             System.out.println("Gecersiz sayi girdiniz");
             return;
         }

        for (int i =2 ; i < number ; i++){
            if(number % i == 0){
            System.out.println("Sayi asal degildir");  // Cozum  1
                check = true;
                break;
            }
        }
        if(check == false){
            System.out.println("Sayi asaldir");
        }



    }
}