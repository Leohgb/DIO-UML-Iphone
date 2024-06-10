package com.mycompany.iphoneTeste;

import com.mycompany.iphone.multifuncional.Iphone;

public class Teste {

    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Teste");
        
        iphone.ligar("11111111111");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        
        iphone.exibirPagina("https://www.teste.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
