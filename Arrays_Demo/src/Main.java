public class Main {
    public static void main(String[] args) {

        String ogrenci1 = "Muhammet" ;   //Tum ogrencileri tek tek yazdirmak yerine arrays e tanimlayip kod fazlaligindan kurtulmamizi saglar
        String ogrenci2 = "Ali";
        String ogrenci3 = "Salih";

        String[] ogrenciler = new String[3]; // 3 elemanli bir dizi tanimladik.
        ogrenciler[0] = "Muhammet";  //ilk eleman 0 index olarak baslar ve ilk elemanina Muhammet i atar.
        ogrenciler[1]= "Ali";
        ogrenciler[2] = "Salih";        //Dizilerde sinirlari astigimiz zaman ArrayIndexOutOfBoundsException hatasi aliriz

        for (int i = 0 ; i<ogrenciler.length ;i++){ // ogrenciler.length ogrencilerin toplam eleman sayisini verir
            System.out.println(ogrenciler[i]);  // i her loop a girdiginde artip arraydaki index numarasina gore
                                                // arraydeki elemani getirir.. ve Bu loop ta ogrenciler arrayinin icindeki elemanlari yazdirir
        }


        for (String ogrenci:ogrenciler) {  //ForEach yontemi ilede yazilir ve daha fazla kullanilir
            System.out.println(ogrenci);     // Array in icinde her bir eleman icin gelir
        }

    }
}