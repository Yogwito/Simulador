/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package modelos.Enum;

/**
 *
 * @author Juan Pablo
 */
public enum Pistas {
    MONZA("Autodromo Nazionale Monza", 5.793,"/assets/images/tracks/monza.png"),
    SPA("Circuit de Spa-Francorchamps", 7.004,"/assets/images/tracks/spa.png"),
    SILVERSTONE("Silverstone Circuit", 5.891,"/assets/images/tracks/silverstone.png"),
    SUZUKA("Suzuka International Racing Course", 5.807,"/assets/images/tracks/suzuka.png"),
    MONTECARLO("Circuit de Monaco", 3.337,"/assets/images/tracks/monaco.png"),
    INTERLAGOS("Autódromo José Carlos Pace", 4.309,"/assets/images/tracks/interlagos.png"),
    NURBURGRING("Nürburgring GP-Strecke", 5.148,"/assets/images/tracks/nurburgring.png"),
    YAS_MARINA("Yas Marina Circuit", 5.281,"/assets/images/tracks/yasmarina.png"),
    BAKU("Baku City Circuit", 6.003,"/assets/images/tracks/baku.png"),
    ZANDVOORT("Circuit Zandvoort", 4.259,"/assets/images/tracks/zandvoort.png"),
    COTA("Circuit of the Americas", 5.513,"/assets/images/tracks/usaGP.png"),
    SEPANG("Sepang International Circuit", 5.543,"/assets/images/tracks/sepang.png"),
    SHANGHAI("Shanghai International Circuit", 5.451,"/assets/images/tracks/shangai.png"),
    BARCELONA("Circuit de Barcelona-Catalunya", 4.675,"/assets/images/tracks/barcelona.png"),
    RED_BULL_RING("Red Bull Ring", 4.318,"/assets/images/tracks/redbullring.png");
    private final double longitudPista;
    private final String nombrePista;
    private final String trackImgPath;
    private Pistas(String nombrePista,double longitudPista, String path) {
        this.nombrePista = nombrePista;
        this.longitudPista = longitudPista;
        this.trackImgPath = path;
    }

    public double getLongitudPista() {
        return longitudPista;
    }

    public String getNombrePista() {
        return nombrePista;
    }

    public String getTrackImgPath() {
        return trackImgPath;
    }
    
    @Override
    public String toString(){
        return nombrePista;
    }
}
