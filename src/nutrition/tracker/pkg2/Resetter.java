/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nutrition.tracker.pkg2;

import java.util.TimerTask;

/**
 *
 * @author moham
 */
 public class Resetter extends TimerTask {
    int ccurrent,current;
    Resetter(int x,int y){
    ccurrent=x;
    current=y;
    }
     
     @Override
     public void run(){
       current=0;
       ccurrent=0;
    
     
     }
}
