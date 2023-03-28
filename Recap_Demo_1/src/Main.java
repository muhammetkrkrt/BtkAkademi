public class Main {
    public static void main(String[] args) {
        int sayi1 = 20;
        int sayi2 = 255;
        int sayi3 = 26 ;

        int enBuyuk = sayi1;  // Basta ilk olarak sayi1 'i  enBuyuk olarak enBuyuk degiskenine atiyoruz

        if(enBuyuk<sayi2){    // sayi2 > enBuyuk oldugu zaman bu kosula girer
            enBuyuk = sayi2 ;  // kosula girdigi zaman sayi2 degiskenimize enBuyuk degiskenimizi atiyoruz.
        }
        if(enBuyuk<sayi3){  // sayi3 > enBuyuk oldugu zaman bu kosula girer
            enBuyuk=sayi3; // Kosula girdigi zaman sayi3 degiskenimizi enBuyuk degiskenimize
        }

        System.out.println("En buyuk: " + enBuyuk);  // bu kisimdada enBuyuk sayimizi yazdiriyoruz

        // ve sonuc olarak 255 sayisini aliyoruz..

    }
}