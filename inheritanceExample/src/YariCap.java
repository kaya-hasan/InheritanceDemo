public class YariCap extends Sekil{
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
}
