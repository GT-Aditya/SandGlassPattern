/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandglasspattern;

import java.util.Scanner;

/**
 *
 * @author KaKarott
 */
public class SandGlassPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int rows;
        Scanner sc = new Scanner(System.in);
        System.out.println("Rows ?");
        rows = sc.nextInt();
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<rows-i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=rows-2;i>=0;i--){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<rows-i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
