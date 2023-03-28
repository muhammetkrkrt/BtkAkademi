public class Main {
    public static void main(String[] args) {

        int sayi = 19;


        // kosullarda esitlik durumunu olcmek istiyorsak "==" oparatorunu kullaniriz ..
        //kosullarda diger oparatorler ">" buyuktur , "<" kucuktur oparatorleri

              // Oparatorler//
        // ==	Eşittir	        x == y
        // !=	Eşit değildir	x != y
        // >	Büyüktür	    x > y
        // <	Küçüktür	    x < y
        // >=	Büyük Eşittir	x >= y
        // <=	Küçük Eşittir	x <= y

        // sayi degiskenimizi kosul icine alip hangi kosulu sagliyorsa o kosula girip icerideki mesaji yazacaktir..
        if(sayi<20){
            System.out.println("Sayi 20'den kucuktur.");
        }
        else if(sayi>15){ //Bu kisimda sayi degiskeni eger if kosuluna girerse else if kosuluna girmez ama sayi 15'ten buyuk oldugunu goruyoruz..
            System.out.println("Sayi 15'ten buyuktur.");
        }
        else{   // Eger sayi degiskeni hic bir kosula girmyorsa else kosuluna her zaman girer..
            System.out.println("Sayi 20'den buyuktur.");
        }
    }
}