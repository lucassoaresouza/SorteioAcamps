/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorteioacamps;

import java.util.Random;

public class Raffle {

    Random rand = new Random();
    
    int RaffleNumber(int min, int max){
        int raffledNumber = rand.nextInt((max - min) + 1) + min;
        return raffledNumber; 
    }
    
}
    
    
    
