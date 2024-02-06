/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorteioacamps;

/**
 *
 * @author lucassouza
 */
public class Utils {
    static String ParseRaffledNumberToString(int raffledNumber){
        String parsedRaffledNumber;
        if(raffledNumber < 10){
           parsedRaffledNumber = "00" + Integer.toString(raffledNumber);
        } else if(raffledNumber >= 10 && raffledNumber <= 99){
            parsedRaffledNumber = "0"+ Integer.toString(raffledNumber);
        } else {
            parsedRaffledNumber = Integer.toString(raffledNumber);
        }  
        return parsedRaffledNumber;
    }    
}
