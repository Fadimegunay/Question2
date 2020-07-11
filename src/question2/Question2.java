/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

import java.util.Scanner;

/**
 *
 * @author fadime
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str="", str_second,str_first;
        int str_value = 0, sum_first = 0, sum_second = 0;
        
        Scanner in = new Scanner(System.in);
        
         //Get input String
        System.out.println("First String Word :  ");
        str_first = in.nextLine();
        System.out.println(str_first);
        
        System.out.println("Second String Word :  ");
        str_second = in.nextLine();
        System.out.println(str_second);
        
        
        
        while(str_value < 2){
            int temp= 0,sum = 0; String str_part;
            if(str_value == 0){
                str= str_first;
                
            }
            else{
                str= str_second;
            }
            
            char[] str_array = str.toCharArray();
            for (int x=0; x< str.length() ;x++) {
                str_part= str.substring(x);

                for(int y = 0;y<str_part.length();y++){

                    if(str_array[y] == str_part.charAt(y)){
                        temp++;
                    }
                    else {
                        break;
                    }

                }

                sum +=temp;
                temp=0;

            }
            if(str_value == 0){
                sum_first = sum;
                str_value++;
            }
            else{
                sum_second= sum;
                str_value++;
            }
            
        }
        System.out.println("str sum_first \t"+ sum_first);
        System.out.println("str sum_second \t"+ sum_second);
    }
    
}
