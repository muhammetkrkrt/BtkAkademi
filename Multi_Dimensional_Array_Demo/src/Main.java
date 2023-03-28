public class Main {
    public static void main(String[] args) {

        String[][] sehirler = new String[3][3]; // 3 satirdan ve 3 sutundan olusan bir array

        sehirler[0][0] ="Istanbul";
        sehirler[0][1] ="Yalova";  // ilk bolgemiz marmara
        sehirler[0][2] ="Izmit";
        sehirler[1][0] ="Izmir";
        sehirler[1][1] ="Mugla";  // ikinci bolgemiz ege
        sehirler[1][2] ="Aydin";
        sehirler[2][0] ="Kars";
        sehirler[2][1] ="Erzurum";  // ucuncu bolgemiz dogu
        sehirler[2][2] ="Erzincan";


        for (String[] bolge: sehirler) {
            System.out.println("-----------");
            for (String sehir: bolge) {
                System.out.println(sehir);
            }
        }
/*                 Cikti
        -----------
                Istanbul
                Yalova
                Izmit
        -----------
                Izmir
                Mugla
                Aydin
        -----------
                Kars
                Erzurum
                Erzincan
 */
    }
}