/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dea15032023;
import java.util.Scanner;
/**
 *
 * @author deainsani
 */
public class latihan2 {
    public static void main(String[] args) {
       int[] numbers = new int[5];
       Scanner in =new Scanner(System.in);
       int num=0, numValues=0;
       boolean valid=true;
    
    while(numValues<numbers.length){
    do{
        valid=true;
        System.out.print("Please enter a unique number: ");
        num = in.nextInt();
        
        for(int i=0; i<numValues;i++){
            if(num == numbers[1]){
                System.out.println("Number Already Exixsts");
                valid=false;
                break;
            }
        }
    }while(!valid);
    numbers[numValues] = num;
    numValues++;
}
}
}
