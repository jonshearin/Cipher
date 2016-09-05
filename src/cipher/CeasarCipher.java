/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cipher;

/**
 *
 * @author jshearin
 */
public class CeasarCipher 
{
    private static final String LOWER_CASE_TEXT = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER_CASE_TEXT = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMERIC_TEXT    = "0123456789";
    
    private static char encodeChar(char ch, String text, int shift)
    {
        int index = text.indexOf(ch);
        char retVal = ch;
        
        if (index > -1)
        {
            index += shift;
            while (index >= text.length())
                index -= text.length();
            
            while (index < 0)
                index += text.length();
            
            retVal = text.charAt(index);
        }
        
        return retVal;
    }
    
    private static char encodeLowerCase(char ch, int shift)
    {
        return encodeChar(ch, LOWER_CASE_TEXT, shift);
    }
    
    private static char encodeUpperCase(char ch, int shift)
    {
        return encodeChar(ch, UPPER_CASE_TEXT, shift);
    }
    
    private static char encodeNumeric(char ch, int shift)
    {
        return encodeChar(ch, NUMERIC_TEXT, shift);
    }
    
    public static String encodeString(String input, int shift)
    {
        StringBuilder output = new StringBuilder();
        char ch;
        
        for(int i = 0; i < input.length(); i++)
        {
           ch = encodeLowerCase(input.charAt(i), shift);
           ch = encodeUpperCase(ch, shift);
           ch = encodeNumeric(ch, shift);
           output.append(ch);
        }
        
        return output.toString();
    }
}
