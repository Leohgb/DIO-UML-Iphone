package com.mycompany.iphone.multifuncional;

import com.mycompany.iphone.Internet.Navegador;
import com.mycompany.iphone.ReprodutorMusical.Musica;
import com.mycompany.iphone.Telefone.Telefone;

public class Iphone implements Musica, Telefone, Navegador {

    @Override
    public void tocar() {
        System.out.println("Iphone está tocando");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica selecionada");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizando pagina");
    }
    
}
