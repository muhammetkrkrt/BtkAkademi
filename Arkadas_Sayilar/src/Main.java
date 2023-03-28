public class Main {
    public static void main(String[] args) {
        // iki sayinin bolenlerinin toplami  birbirine esitse arkadas sayilardir
        int number1= 220;
        int number2= 284;
         int numberTotal1= 0 ;
         int numberTotal2= 0;

         for (int i =1 ; i < number1; i++){
             if(number1%i == 0){
                 numberTotal1 += i ;
             }
         }
        for (int i =1 ; i < number2; i++){
            if(number2%i == 0){
                numberTotal2 += i ;
            }
        }
                                 // && ve oparatorutur ikiside dogru ise kosula girecektir
        if(number1 == numberTotal2 && number2 == numberTotal1){
            System.out.println("Arkadas sayilardir");
        }else{
            System.out.println("Arkadas sayilar degildir");
        }
                               // || veya oparatoru ikisinden birinin dogru olmasi yeterlidir kosula girer..

    }
}