import javax.swing.*;
public class Game 
{

    public static void main(String[] args) 
    {
       int randomno=(int)(Math.random()*100+1);
       int human=0;
       System.out.println("The Correct Guessing number Would Be : "+randomno);
       int count=0;
       int countLimit=4;
       JOptionPane.showMessageDialog(null , "You only have 5 chances");
       while(human != randomno)
       {
           if(count<=countLimit)
           {
           String response=JOptionPane.showInputDialog(null, " Enter a Number between 1 and 100","Guessing Game",3);
           human=Integer.parseInt(response);
           count++;
           String str1 = determineGuess(human,randomno, count);
           JOptionPane.showMessageDialog(null," "+str1);
           }
           
       }
    }  
    public static String determineGuess(int human, int randomno, int count)
    {
        int score = 50;
        if(human <=0 || human>100){
           
            return " INCORRECT GUESS";
            }
        else if(human == randomno ){
            return" CORRECT!! \n Your score is : "+score;
            }
            else if(human> randomno){
              
                return " Your guess is TOO HIGH, try again.\n Try Number:"+count;
            }
            else if(human< randomno){
              
                return " Your guess is TOO LOW, try again. \n Try Number :"+count;
            }
            else {
                
                return " Your guess is INCORRECT \n Try Number :"+count; 
            }
    }    
}