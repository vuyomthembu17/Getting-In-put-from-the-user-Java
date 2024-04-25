/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gettingin;

/**
 *
 * @author VuyoMthembu
 */
import java.util.Scanner;
public class GettingIn 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       
        //Getting input from the user
        Scanner Sc = new Scanner(System.in);
        String name = null;
        int age = 0;
        double balance = 0;
        float myamount = 0;
        
        try
        {
            
        //String Name
        System.out.println("Please enter your name: ");
        name = Sc.nextLine();
        }
        catch( Exception e)
        {
            System.out.println(e);
        }
        
        try
        {
        //Int Age
        System.out.println("Please eneter your age: ");
        age = Sc.nextInt();
        }
        catch( Exception e1)
        {
            System.out.println(e1);
        }
        
        try
        {
        //Balance
        System.out.println("Please enter your balance: ");
         balance = Sc.nextDouble();
        }
        catch( Exception e2)
        {
            System.out.println(e2);
        }
        
        try
        {
        //Target Amount
        System.out.println("Please enter the target amount: ");
        myamount = (float)Sc.nextDouble();
        }
        catch( Exception e3)
        {
            System.out.println(e3);
        }
       
       finally{ 
        System.out.println(name + age + balance + myamount);
        }
       
        }
        
         
    }
    
