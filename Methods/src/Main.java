public class Main {
    public static void main(String[] args) {  //Fonksinyon yazarak kendini tekrarlamayi durdurursunuz..
        numberFind();

    }

    public static void numberFind(){  //Parametresiz method
        int[] numbers = new int[] {1,2,5,7,9,0};

        int aranacak = 5 ;
        boolean check = false;

        for (int sayi: numbers) {
            if(sayi == aranacak){
                check=true;
                break;
            }
        }
        if(check){
            mesajVer("Sayi dizinin icerisinde mevcut ");
        }else{
            mesajVer("Sayi dizinin icerisinde mevcut degildir");
        }

    }

    public static void mesajVer(String mesaj){  //Parametreli method

        System.out.println(mesaj);
    }
}