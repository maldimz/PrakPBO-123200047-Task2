/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.util.Scanner;

/**
 *
 * @author Dimas
 */
public class Main {
    public static void main(String[] args) {
        int loop = 1, choice = 0;
        double input1, input2, input3;

        while(loop==1){
            Scanner input = new Scanner(System.in);
            System.out.println("=========");
            System.out.println("Main Menu");
            System.out.println("=========");
            System.out.println("1. Calculate Cuboid");
            System.out.println("2. Calculate Cylinder");
            System.out.print("Choose : ");
            
            try{
                choice = input.nextInt();
            }catch(Exception e){
                System.out.println("Input Error");
            }
            
            switch(choice){
                case 1:
                    try{
                        System.out.print("Height Input : ");
                        input1 = input.nextDouble();
                        System.out.print("Length Input : ");
                        input2 = input.nextDouble();
                        System.out.print("Width Input : ");
                        input3 = input.nextDouble();
                        
                        Balok output = new Balok(input1, input2, input3);
                        output.rectangleOut();
                        output.cuboidOut();
                    }catch(Exception e){
                        System.out.println("Input Error");
                    }
                    break;
                case 2:
                    try{
                        System.out.print("Height Input : ");
                        input1 = input.nextDouble();
                        System.out.print("Radius Input : ");
                        input2 = input.nextDouble();
                        
                        Tabung out = new Tabung(input1, input2);
                        out.circleOut();
                        out.cylinderOut();
                    }catch(Exception e){
                        System.out.println("Input Error");
                    }
                    break;
                
                default:
                    break;
            }
            System.out.print("Try Again ? (Yes: 1 || No: 0)");

            try{
                loop = input.nextInt();
            }catch(Exception e){
                System.out.println("Input Error");
            }
        }   
    }
}
