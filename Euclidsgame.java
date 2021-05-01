/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package euclidsgame;
import java.util.Scanner;
/**
 *
 * 
 */
public class Euclidsgame {
    
    static int Eculid_Game(int first , int second){
        
        if(second <=0){
            return 0;
        }
        if ((int)first/second>1){
            return 1;
        }
        return Eculid_Game(second , first-second)+1;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner (System.in);
        System.out.println("enter the first number");
        int firstnum=Integer.parseInt(input.nextLine());
        System.out.println("enter the second number");
       int secondnum=Integer.parseInt(input.nextLine());
        int temp=0;
        if(firstnum<secondnum){
            temp=firstnum;
            firstnum=secondnum;
            secondnum=temp;
            
        }
        
        int counter = Eculid_Game(firstnum , secondnum);
        if(counter % 2!=0){
            System.out.println("player 1 wins");
        }
        else{
             System.out.println("player 2 wins");
        }
    }
}
