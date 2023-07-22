/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nutrition.tracker.pkg2;

import java.util.TimerTask;
import java.util.Timer;

/**
 *
 * @author moham
 */
public class NutritionTracker2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic he      
       foods chicken=new foods(30,50,60);
    foods Apple =new foods(100,52,39);
    foods Artichoke = new foods(128,60,32);	
    foods Arugula = new foods(2,11,31);
    foods Asparagus = new foods(12,2,15);	
    foods Aubergine = new foods(458,115,30);	
    foods Beetroot = new foods(82,35,64);	/* 1 beet = 82g  */
    foods BellPepper = new foods(73,15,32 );	/*1 pepper (73 g)*/
    foods BlackOlives = new foods(3,2,30);	/*1 olive (2.7 g)*/
    foods Broccoli = new foods(608,207,32 );	/*1 bunch (608 g)*/
    foods BrusselsSprouts = new foods(19,6,29);	/*1 sprout (19 g)*/
    foods Cabbage = new	foods (908, 227,15);     /*head (908 g)	 */
    foods Capsicum = new foods (45,12,15 );       /*1 pepper (45 g)*/
    foods Carrot = new foods(61,25,39);	        /*1 carrot (61 g)*/
    foods Cauliflower = new foods(13,3,10);	/*1 floweret (13 g)*/	    
    foods Celery = new foods (40,6,15);	        /*1 stalk (40 g)*/
    foods Chard = new foods (48,9,32);	        /*1 leaf (48 g)	*/ 
    foods CherryTomato = new foods(20,20,15);     /*1 cherry tomato (20 g)*/	
    foods Chicory = new foods(53,38,0);	        /*1 head (53 g)*/	
    foods ChineseCabbage = new foods(840,134,45); /*1 head (840 g)*/	
    foods Chives = new foods(3,1,50);		/*1 tbsp, chopped (3 g)*/	 
    foods CollardGreens = new foods(36,12,52);   /*1 cup, raw (36 g)*/	
    foods Corn = new foods(154,562,45);		/*1 cup (154 g)*/	
    foods Courgette = new foods(196,33,28);	/*1 courgette (196 g)*/	
    foods CreamedSpinach = new foods(200,148,50);/*1 cup (200 g)*/
    foods Cucumber = new foods(410,66,15);       /*1 cucumber (410 g)*/
    foods Eggplant = new foods(458,115,50);	/*1 eggplant (458 g)*/	
    foods Endive = new foods(513,87,45);	        /*1 head (513 g)*/
    foods Fennel = new foods(234,73,50);		/* 1 bulb (234 g)*/
    foods Garlic = new foods(3,4,30);	        /* 1 clove (3 g)*/
    foods Gherkin = new	foods(65,9,32);	        /*1 gherkin (65 g)*/
    foods Gourd = new foods(771,108,15);	        /*1 gourd (771 g)*/
    foods GreenBeans = new foods(110,34,32);	/*1 cup (110 g)*/
    foods GreenOlives = new foods(3,2,30);	/*1 olive (2.7 g)*/
    foods GreenOnion = new foods(15,5,32);	/*1 green onion (15 g)*/
    foods Horseradish = new foods(15,7,35);	/*1 tbsp (15 g)*/
    foods Kale = new foods(67,33,4);		/*1 cup, chopped (67 g)*/
    foods Kohlrabi = new foods(400,108,20);	/*1 kohlrabi (400 g)*/
    foods Kumara = new foods(130,112,54);	/*1 kumara (130 g)*/
    foods Leek = new foods(89,54,32);		/*1 leek (89 g)*/
    foods Lettuce = new	foods(600,90,15);	        /*1 head (600 g)*/	
    foods Mushrooms = new foods(6,1,10);		/*1 mushroom (5.4 g)*/
    foods MustardGreens = new foods(56,15,32);	/*1 cup, chopped (56 g)*/
    foods Nori  = new foods(3,1,1);	        /*1 sheet (2.6 g)*/
    foods Okra  = new foods(12,4,8); 	        /*1 pod (12 g)*/
    foods Olives  = new foods(3,2,20);	        /*1 olive (2.7 g)*/ 
    foods Onion  = new foods(85,34,10);	        /*1 onion (85 g)*/
    foods Parsnips  = new foods(170,128,97);	/*1 parsnip (170 g)*/
    foods Peas  = new foods(98,79,51);	        /*1 cup (98 g)*/
    foods Pepper  = new foods(75,20,32);         /*1 pepper (75 g)*/	
    foods Potato  = new	foods(213,164,93);        /*1 potato (213 g)*/	
    foods Pumpkin  = new foods(196,51,64);	/*1 pumpkin (196 g)*/
    foods Radishes  = new foods(5,1,32);	        /*1 radish (4.5 g)*/
    foods RedCabbage  = new foods(22,7,32);	/*1 leaf (22 g)	*/
    foods Rutabaga  = new foods(386,147,79);	/*1 rutabaga (386 g)*/
    foods Shallots  = new foods(25,18,30);	/*1 shallot (25 g)*/	
    foods Spinach  = new foods(340,78,15);        /*1 bunch (340 g)*/
    foods Squash  = new	foods(196,88,51);         /*1 squash (196 g)*/	
    foods SweetPotato  = new foods(130,112,54);	/*1 potato (130 g)*/	
    foods Tomato  = new	foods(111,20,15);         /*1 tomato (111 g)*/	
    foods TurnipGreens  = new foods(170,34,62);   /*1 turnip green (170 g)*/
    foods Turnips  = new foods(122,34,62);	/*1 turnip (122 g)*/ 
    foods Wasabi  = new foods(169,184,51);	/*1 root (169 g)*/
    foods WinterSquash = new foods(431,147,51);   /*1 squash (431 g)*/	
    foods Zucchini  = new foods(196,33,15);	/*1 zucchini (196 g)*/	
     
      
   int current=0,ccurrent=0;
  Object foods = new Object();
// There's no support for this
 // expecting to get "foo"
 JFrame frame =new JFrame();
 
 
Timer timer= new Timer();
      
 TimerTask task = new Resetter(current,ccurrent);
         
        timer.schedule(task, 1000, 86400000);
        
    }
    
}
