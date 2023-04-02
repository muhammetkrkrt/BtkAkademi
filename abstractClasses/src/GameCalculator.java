public abstract  class GameCalculator {
    public abstract void hesapla(); // extends eden tum siniflar icin override islemini zorunlu kiliyoruz...
    public final void gameOver(){
        System.out.println("Oyun bitti..");
    }
}
