public class Main {
    public static void main(String[] args) {

        //Stringler bir char dizisidir.
        String message = "Bugun hava cok guzel :)";
        System.out.println(message);

        System.out.println("Eleman sayisi : " + message.length()); //message degiskeninin uzunlugunu verir
        System.out.println("5.eleman : " + message.charAt(4)); // message degiskenindeki 5. elemani verir yani 4.index
        System.out.println("Birlestirilmis mesaj : " + message.concat(" Disari cikalim.")); // degiskene yeni string ile birlestirir
        System.out.println("Baslangicta var mi :" + message.startsWith("Bu")); // true yada false dondurur.
        System.out.println("Sonunda var mi : " + message.endsWith(")")); // Stringin sonunda ifade varmi true yada false doner.
        char[] chars = new char[5];
        // 0 dahil edilir ama 5 dahil edilmez
        message.getChars(0,5,chars,0); // String degiskenini chars arrayine atiyoruz belirledigimiz yerlerden.
        System.out.println(chars);
        System.out.println(message.indexOf('a')); // Stringin icindeki ilk a gecen indexi verir ve operasyonu bitirir.
        System.out.println(message.lastIndexOf('a')); // Stringin sonundan baslar ve ilk a gecen indexi verir ve operasyon biter.
        System.out.println(message.replace('a','i')); // String icindeki a yerine i harflerini atadik..
        String newMessage = message.replace('a','i'); // newMessage a message i degistirip atadik..
        System.out.println(message.substring(5));//Bir metnin icerisinden parca almak icin kullanilir -- 5 indexsinden itibaren parcalar.
        System.out.println(message.substring(6,10)); // 6 dahil 10 dahil degil seklinde index numaralarina gore bolup getirir..

        for (String kelime: message.split(" ")) { //Array seklinde bolecegi icin foreach loop'unda her boldugu kelimeyi yazdirdik
            System.out.println(kelime);       //split methodu verdigimiz parametreye gore metni parcalar..
        }

        System.out.println(message.toLowerCase()); // mesajimizin tum harflerini kucuk harflere cevirir..
        System.out.println(message.toUpperCase()); // mesajimizin tum harflerini buyuk harflere cevirir..
        System.out.println(message.trim()); // message stringindeki basindaki ve sonundaki bosluklari siler..

    }
}