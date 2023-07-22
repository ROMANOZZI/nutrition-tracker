/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nutrition.tracker.pkg2;

/**
 *
 * @author moham
 */
public class users {
    int weight,height;
   
    boolean diabetic;
    String gender;
    String BodyShape;
    int age;
    String Activity;
users(int x,int y,boolean b,String f,int aa,String Ac){
weight =x;
height=y;
diabetic=b;
gender=f;

age=aa;
Activity=Ac;








}    
    String detect_Body_shape(String gender,double height,double weight){
    double BMI;
   double height_T=height/100.0;
   
    BMI= weight/(height_T*height_T);
    
    if(BMI<18.5)
        BodyShape="underweight";
    else if(BMI>18.5&&BMI<24.5)
        BodyShape="Normal";
    else if(BMI>24.5)
        BodyShape="OverWeight";
     return BodyShape;
}
double calculateCalories(int weight,int height,String gender,String Activity, int age,String BodyShape){
    double BMR ,Calories,Climit;
    if(gender=="Male"){
    BMR=88.362+(13.397*weight)+(4.799*height)-(5.677*age);
    System.out.print(BMR);}
else
        BMR=447.593+(9.247*weight)+(3.098*height)-(4.330*age);
    
    if (Activity=="sedentary"){
        Calories=1.2*BMR;
    }
    else if(Activity=="light"){
         Calories=1.375*BMR;
}
    else if (Activity=="moderete"){
        Calories=1.55*BMR;
    }
    else
        Calories=1.75*BMR;
    
    if(BodyShape=="underweight")
        Climit=Calories+500;
    else if(BodyShape=="Normal")
            Climit=Calories;
    else
           Climit=Calories-500;
      
    return Climit;
}
double CalculateHydration(int Weight){
double Limit;
Limit=Weight*0.033;
Limit/=0.325;
return Limit;
}
}
