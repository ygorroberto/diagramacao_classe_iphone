package iphone.celular;

import iphone.aparelho_telefonico.AparelhoTelefonico;
import iphone.navegador_internet.NavegadorInternet;
import iphone.reprodutor_musical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    @Override
    public void realizarLigacoesTelefonicas() {
        System.out.println("REALIZANDO LIGAÇÕES COM APARELHOS TELEFÔNICOS");
    }

    @Override
    public void navegarNaInternet() {
        System.out.println("NAVEGANDO NA INTERNET COM NAVEGADORES");
    }

    @Override
    public void reproduzirMusica() {
        System.out.println("REPRODUZINDO MÚSICAS COM REPRODUTORES MUSICAIS");
    }
}
