/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package modelos.Enum;

/**
 *
 * @author Trujirendjj
 */
public enum Pistas {
    MONZA("Autodromo Nazionale Monza", 5.793,"/assets/images/tracks/monza.png",
            "/assets/images/simulation/track_image/monza.jpg"),
    SPA("Circuit de Spa-Francorchamps", 7.004,"/assets/images/tracks/spa.png",
    "/assets/images/simulation/track_image/spa.jpg"),
    SILVERSTONE("Silverstone Circuit", 5.891,"/assets/images/tracks/silverstone.png",
    "/assets/images/simulation/track_image/silverstone.jpg"),
    SUZUKA("Suzuka International Racing Course", 5.807,"/assets/images/tracks/suzuka.png",
    "/assets/images/simulation/track_image/suzuka.jpg"),
    MONTECARLO("Circuit de Monaco", 3.337,"/assets/images/tracks/monaco.png",
    "/assets/images/simulation/track_image/monaco.jpg"),
    INTERLAGOS("Autódromo José Carlos Pace", 4.309,"/assets/images/tracks/interlagos.png",
    "/assets/images/simulation/track_image/interlagos.jpg"),
    NURBURGRING("Nürburgring GP-Strecke", 5.148,"/assets/images/tracks/nurburgring.png",
    "/assets/images/simulation/track_image/nurburgring.jpg"),
    YAS_MARINA("Yas Marina Circuit", 5.281,"/assets/images/tracks/yasmarina.png",
    "/assets/images/simulation/track_image/yasmarina.jpg"),
    BAKU("Baku City Circuit", 6.003,"/assets/images/tracks/baku.png",
    "/assets/images/simulation/track_image/baku.jpg"),
    ZANDVOORT("Circuit Zandvoort", 4.259,"/assets/images/tracks/zandvoort.png",
    "/assets/images/simulation/track_image/zandvoort.jpg"),
    COTA("Circuit of the Americas", 5.513,"/assets/images/tracks/usaGP.png",
    "/assets/images/simulation/track_image/cota.jpg"),
    SEPANG("Sepang International Circuit", 5.543,"/assets/images/tracks/sepang.png",
    "/assets/images/simulation/track_image/sepang.jpg"),
    SHANGHAI("Shanghai International Circuit", 5.451,"/assets/images/tracks/shanghai.png",
    "/assets/images/simulation/track_image/shanghai.jpg"),
    BARCELONA("Circuit de Barcelona-Catalunya", 4.675,"/assets/images/tracks/barcelona.png",
    "/assets/images/simulation/track_image/barcelona.jpg"),
    RED_BULL_RING("Red Bull Ring", 4.318,"/assets/images/tracks/redbullring.png",
    "/assets/images/simulation/track_image/redbull.jpg");
    private final double longitudPista;
    private final String nombrePista;
    private final String trackImgIconPath;
    private final String trackImgPath;
    private Pistas(String nombrePista,double longitudPista, String path, String trackImg) {
        this.nombrePista = nombrePista;
        this.longitudPista = longitudPista;
        this.trackImgIconPath = path;
        this.trackImgPath = trackImg;
    }

    public double getLongitudPista() {
        return longitudPista;
    }

    public String getNombrePista() {
        return nombrePista;
    }

    public String getTrackImgIconPath() {
        return trackImgIconPath;
    }

    public String getTrackImgPath() {
        return trackImgPath;
    }
    
    @Override
    public String toString(){
        return nombrePista;
    }
}
