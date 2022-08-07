import java.util.*;
    public class Frequency   
    {  
         public static void main(String[] args) { 
            Scanner sc=new Scanner(System.in); 
            String str = sc.nextLine();  
            int[] freq = new int[str.length()];  
            int i, j;  
              
            //Converts given string into character array  
            char string[] = str.toCharArray();  
              
            for(i = 0; i <str.length(); i++) {  
                freq[i] = 1;  
                for(j = i+1; j <str.length(); j++) {  
                    if(string[i] == string[j]) {  
                        freq[i]++;  
                          
                        //Set string[j] to 0 to avoid printing visited character  
                        string[j] = '+';  
                    }  
                }  
            }  
            int k=0;
              for(char k:string)
                 System.out.println(k);
            //Displays the each character and their corresponding frequency  
            System.out.println("Characters and their corresponding frequencies");  
            for(i = 0; i <freq.length; i++) {  
                if(string[i] != ' ' && string[i] != '+')  
                    System.out.println(string[i] + "-" + freq[i]);  
            }  
        }  
    }  