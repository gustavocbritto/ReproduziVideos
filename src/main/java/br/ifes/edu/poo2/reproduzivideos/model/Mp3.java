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
public class Mp3 extends AVideo  {
    
    public Mp3(Codec codec){
        this.codec = codec;
    }
    
    public void abrirAruivoELegendas(){
        System.out.println("Abrindo Arquivo e legenda Mp3");
    }
    public void reproduzirVideo(){
        System.out.println("Reproduzindo Video Mp3. Codec: "+ codec.getCodec());
    }
    public void finalizarReproducao(){
        System.out.println("Finalizando Mp3");
    }    
}
