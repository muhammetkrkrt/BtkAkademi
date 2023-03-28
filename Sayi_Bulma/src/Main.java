public class Main {
    public static void main(String[] args) {

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
            System.out.println("Sayi dizinin icerisinde mevcuttur");
        }else{
            System.out.println("Sayi dizinin icerisinde mevcut degildir");
        }

    }
}