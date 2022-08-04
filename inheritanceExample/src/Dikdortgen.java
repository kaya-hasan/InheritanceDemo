public class Dikdortgen extends Sekil{
    public void Cevre(int kenar1, int kenar2){
        x = kenar1;
        y = kenar2;
        int dikdortgenCevre = 2*(kenar1 + kenar2);
        System.out.println("Dikdortgen Cevresi : " +dikdortgenCevre);

    }
    public void Alan(int kenar1, int kenar2){
        x = kenar1;
        y = kenar2;
        int dikdortgenAlan = kenar1 * kenar2;
        System.out.println("Dikdortgen Alani: " + dikdortgenAlan);
    }
}
