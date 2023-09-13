public class OfftheWall extends AlbumDeMusica{
    String rockwithyou_song;
    int NumeroDePlatina;

    public OfftheWall(){}

    public OfftheWall(String rockwithyou_song) {
        this.rockwithyou_song = rockwithyou_song;
    }

    public OfftheWall(String rockwithyou_song, int numeroDePlatina) {
        this.rockwithyou_song = rockwithyou_song;
        NumeroDePlatina = numeroDePlatina;
    }

    public String getRockwithyou_song() {
        return rockwithyou_song;
    }

    public void setRockwithyou_song(String rockwithyou_song) {
        this.rockwithyou_song = rockwithyou_song;
    }

    public int getNumeroDePlatina() {
        return NumeroDePlatina;
    }

    public void setNumeroDePlatina(int numeroDePlatina) {
        NumeroDePlatina = numeroDePlatina;
    }

    //função//

    public void Tocar() {
        Rockwithyou();
    }

    private void Rockwithyou(){ System.out.println ("Tocando a favorita do album: Rock With You..."); }

    @Override
    public String toString() {
        return "OfftheWall{" +
                "rockwithyou_song='" + rockwithyou_song + '\'' +
                ", NumeroDePlatina=" + NumeroDePlatina +
                '}' + super.toString();
    }
}

