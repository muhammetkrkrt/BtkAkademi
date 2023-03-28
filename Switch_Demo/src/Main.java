public class Main {
    public static void main(String[] args) {

        char grade = 'A'; // aldigimiz harf notu A olsun

        switch (grade){  //Case'te kontrol etmek istedigimiz parametreyi yolladik
                        // Hangi case e girerse oradaki sartlari uygular..
            case 'A' :
                System.out.println("Mukemmel : gectiniz");
                break;
            case 'B':  // bu iki kisimda ayni ciktiyi verir..
            case 'C' : //
                System.out.println("Iyi : gectiniz");
                break;
            case 'D' :
                System.out.println("Fena degil : gectiniz");
                break;
            case 'F':
                System.out.println("Malesef kaldiniz");
                break;
            default:  // hic bir case e girmez ise default degerine girer..
                System.out.println("gecersiz not girdiniz");
                break;
        }



    }
}