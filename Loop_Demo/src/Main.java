public class Main {
    public static void main(String[] args) {

        // For loop

        //i++ --> i yi bir arttir.
        //i-- --> i yi bir azalt.

        System.out.println("For dongusu basladi");
        for (int i = 1 ; i <10 ; i++ ){
            System.out.println(i);  //for dongusune her girdiginde i yi yazdirip 1 arttirir ve
            //cikti                 // i <10 kucutur kosulunu sagladigi surece yazdirmaya  devam eder.
              //1                   // 2 ser 2 ser arttirmak istersek i++ yerine i+=2 yazmamiz yeterliydi.
              //2
              //3                // println oldugu icin ciktimiz line atlayip yazdiracaktir
              //4                // yan yana yazdirma istersek printf veya print yazdirmamiz yeterlidir
              //5
              //6
              //7
              //8
              //9
        }
        System.out.println("For dongusu bitti \n");

        // While loop

        int i = 1 ;

        System.out.println("Whie dongusu basladi\n");
        while(i<10){  // i < 10 kosulu sagladigi surece loop icerisie girip yazdiriyoruz..
            System.out.println(i);
            i++; // iceride bu sekilde degiskeni arttirmaz isek infinity loop sekilde sonsuza kadar yazar..
                 // 2 ser 2 ser arttirmak istiyorsak ayni sekilde i+= 2 ; yapiyoruz..
        }
        System.out.println("while dongusu bitti\n");

        // Do -While loop

        int j = 1 ;
        System.out.println("Do While dongusu basladi\n");
        do {
            System.out.println(j); // while ile sadece farki ilk loop a giris kisminda kontrol yapilmaz
            j++;
        }while (j<10);

        System.out.println("do-While dongusu bitti");

    }
}