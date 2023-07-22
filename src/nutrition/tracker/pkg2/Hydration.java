/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nutrition.tracker.pkg2;

/**
 *
 * @author moham
 */
public class Hydration {
    int current;
    int Limit;
    boolean pressed;
    String text;
    Hydration(int x,int y,boolean z){
        current=x;
        Limit=y;
        pressed=z;
    }
     double Inc_current(){
         if(pressed)
         current=current +1;
         return current;
         
}
void compare(){
if (current<Limit)
    text="you need some more water";

}
}
