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
public abstract class AVideo implements Video {
    
    protected Codec codec;
    
    //Template method
    public void reproduzir(){
        abrirAruivoELegendas();
        reproduzirVideo();
        finalizarReproducao();
    }
    
    public abstract void abrirAruivoELegendas();
    public abstract void reproduzirVideo();
    public abstract void finalizarReproducao();
}
