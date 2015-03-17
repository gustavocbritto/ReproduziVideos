/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo2.reproduzivideos.control;

import br.ifes.edu.poo2.reproduzivideos.model.Avi;
import br.ifes.edu.poo2.reproduzivideos.model.Codec;
import br.ifes.edu.poo2.reproduzivideos.model.Mp3;
import br.ifes.edu.poo2.reproduzivideos.model.Video;

/**
 *
 * @author Gustavo
 */
public class ControleVideos {
    
    Video video;
    
    public void start(){
        video = new Avi(new Codec("Avi"));
        video.reproduzir();
        
        video = new Mp3(new Codec("Mp3"));
        video.reproduzir();
    }
}
