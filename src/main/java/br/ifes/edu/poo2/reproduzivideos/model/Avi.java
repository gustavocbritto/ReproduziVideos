/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo2.reproduzivideos.model;

/**
 *
 * @author Gustavo
 */
public class Avi extends AVideo {
    
    public Avi(Codec codec){
        this.codec = codec;
    }
    
    public void abrirAruivoELegendas(){
        System.out.println("Abrindo Arquivo e legenda Avi");
    }
    public void reproduzirVideo(){
        System.out.println("Reproduzindo Video Avi. Codec: "+ codec.getCodec());
    }
    public void finalizarReproducao(){
        System.out.println("Finalizando Avi");
    }
    
}
