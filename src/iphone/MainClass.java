package iphone;

import iphone.aparelho_telefonico.AparelhoTelefonico;
import iphone.aparelho_telefonico.Lg;
import iphone.aparelho_telefonico.Nokia;
import iphone.aparelho_telefonico.Samsung;
import iphone.navegador_internet.Chrome;
import iphone.navegador_internet.Firefox;
import iphone.navegador_internet.NavegadorInternet;
import iphone.navegador_internet.Opera;
import iphone.reprodutor_musical.ITunes;
import iphone.reprodutor_musical.ReprodutorMusical;
import iphone.reprodutor_musical.Vlc;
import iphone.reprodutor_musical.Winamp;

public class MainClass {

    public static void main(String[] args) {
        AparelhoTelefonico samsung = new Samsung();
        AparelhoTelefonico lg = new Lg();
        AparelhoTelefonico nokia = new Nokia();

        samsung.realizarLigacoesTelefonicas();
        lg.realizarLigacoesTelefonicas();
        nokia.realizarLigacoesTelefonicas();

        //

        NavegadorInternet chrome = new Chrome();
        NavegadorInternet firefox = new Firefox();
        NavegadorInternet opera = new Opera();

        chrome.navegarNaInternet();
        firefox.navegarNaInternet();
        opera.navegarNaInternet();

        //

        ReprodutorMusical vlc = new Vlc();
        ReprodutorMusical winamp = new Winamp();
        ReprodutorMusical itunes = new ITunes();

        vlc.reproduzirMusica();
        winamp.reproduzirMusica();
        itunes.reproduzirMusica();
    }
}
