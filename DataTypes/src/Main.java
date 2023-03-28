public class Main {
    public static void main(String[] args) {

        //Java ve C# tip guvenli bir dildir.

        int sayi = 12;
        /* sayi = "Ankara" --> int bir sayi bu sekilde bir metinsel ifade olarak tanimlanamaz
           int  --> Bellekte 4 bytes yer tutabilir , primitive tiptir  Ilkel veri tipi'de denir
          sayi = 13154545415; --> sinirlari asiyor. */

        byte sayi1 = 127; // byte  --> bellekte 1 byte yer tutar .127 ve -128 arasinda deger alir byte bir integer veri tipidir.
        // sayi1 = 128; --> burada sinirlari astigimiz icin hata aliriz.

        short sayi2 = 15555; // short --> bellekte 2 bytes yer tutar. -32768 to 32767 arasinda deger alir short bir integer veri tipidir.

        long sayi3 = 444545465; // long --> bellekte 8 bytes yer tutar. integer veri tipidir.

        float sayi4 = 12.6f; // float --> bellekte 4 bytes yer tutar. floating-point number veri tipidir.

        double sayi5 = 12.5; // double --> bellekte 8 bytes yer tutar. floating-point number veri tipidir.

        boolean check = true ; // boolean --> bellekte 1 byte yer tutar . dogru yada yanlis deger dondurur.

        char char1= 'B'; // char --> bellekte 2 byte yer tutar . SingleCharacter veri tipidir.

    }
}