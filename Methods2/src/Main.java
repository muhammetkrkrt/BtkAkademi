public class Main {
    public static void main(String[] args) {

        String mesaj = "Bugun hava cok guzel";
        mesaj.substring(0,2); // bu kisimda methods bize hic birsey yazdirmaz sadece dondurur
                              // void degerleri degiskenlere atayamayiz..

        String toplam = String.valueOf(topla(5,7));
        System.out.println("Toplamlari --> " + toplam );

    }
    public static void add(){   // void methodlari istediginiz operasyonlari yapar.
        System.out.println("Eklendi");                          // return donduren methodslar sonucu dondurur..

    }
    public static void delete(){
        System.out.println("Silindi");
    }
    public static void update(){
        System.out.println("Guncellendi");
    }

    public static int topla(int sayi1 , int sayi2){  // return donduren methods lar ..
        int toplam = sayi1 + sayi2 ;
        return toplam;
    }
}