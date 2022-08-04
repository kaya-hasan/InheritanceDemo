public class Sekil {
    int x, y;
    public void Alan(){
        double pi = 3.14;
        int yaricap = 5;
        int cemberAlan = (int) (pi * yaricap * yaricap);
        System.out.println("Çember alanı: " + cemberAlan);
    }
    public void Cevre(){
        double pi = 3.14;
        int yaricap = 5;
        int cemberCevre = (int)(2 * pi * yaricap);
        System.out.println("Çember çevresi: " + cemberCevre);

    }
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
