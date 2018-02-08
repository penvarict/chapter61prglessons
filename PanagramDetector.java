

import java.util.Scanner;

class PanagramDetector
{

  public static void main ( String[] args )
  {
    System.out.println("Give me a sentence ");
    Scanner scan = new Scanner(System.in);
    String string = scan.nextLine(); //take current input
    Char[] string_char_array = string.toCharArray();
    String alphabet = "abcdefghijklmnopqrstuvwxyz" 
    Char[] alphabet_char_array = alphabet.toCharArray();
    boolean isPan;
    

    for (int index = 0; index < letters.length; index++) { // go through loop entire time for 
                                                        //each letter
      char letter = string_char_array.charAt(index);


        for (int i = 0; i < alphabet_char_array.length; i++){//go through alphabet for matches
            char current_letter = alphabet_char_array[i];

            if (letter.equals(current_letter) ){
                isPan = true;
                
            }
            else{
                isPan = false;
                
            }break; // if one letter is missing return false and end for loop

        }
        
    }
    return isPan;
  }
} 