/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorteioacamps;

import java.util.Random;

public class FazSorteio {

    Random rand = new Random();
    
    int sorteio_numero(int min, int max){
    
        int numero_sorteado = rand.nextInt((max - min) + 1) + min;
       
        return numero_sorteado; 
    
    }
    
}
    
    
    
