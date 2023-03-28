public class Main {
    public static void main(String[] args) {

        double[] myList = {1.2 , 1.4 , 3.4 ,4.6}; //Arka planda new yapiyor
        double total = 0 ;
        double max = myList[0] ;

        for (double number : myList){  //ForEach ile array daki sayilari yazdiriyoruz
            System.out.println(number);
            total += number ;  // Arraydaki sayilari topluyoruz
            if(max<number){   // Array icindeki en buyuk sayiyi bulmak icin kosul ile kontrol edip eger sayi buyuk max ise
                max = number;  // max degiskenine sayimizi tanimliyoruz
            }
        }

        System.out.println("Toplamlari: " + total);  // Toplamlari ekrana yazdiriyoruz
        System.out.println("En buyuk: " + max);   //En buyuk sayiyi ekrana yazdiriyoruz


    }
}