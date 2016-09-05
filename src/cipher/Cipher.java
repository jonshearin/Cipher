/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cipher;

import java.util.Scanner;

/**
 *
 * @author jshearin
 */
public class Cipher 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        try(Scanner reader = new Scanner(System.in))
        {
            System.out.print("Enter shift: ");
            int shift = reader.nextInt();
            
            reader.nextLine();
            
            System.out.print("Enter test to encode: ");
            String input = reader.nextLine();
            
            System.out.println("Encoded text: " + CeasarCipher.encodeString(input, shift));
        }
    }
 }
