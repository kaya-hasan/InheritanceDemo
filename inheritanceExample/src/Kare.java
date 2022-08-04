public class Kare extends Dikdortgen{
    public void Cevre(int kenar1){
        x = kenar1;
        int kareCevre = 4 * kenar1;
        System.out.println("Kare Çevresi: " + kareCevre);

    }
    public void Alan(int kenar1){
        x = kenar1;
        int kareAlan = kenar1 * kenar1;
        System.out.println("Kare Alanı: " + kareAlan);
    }
}
