/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cipher;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jshearin
 */
public class CeasarCipherTest
{

    public CeasarCipherTest()
    {
    }

    @BeforeClass
    public static void setUpClass()
    {
    }

    @AfterClass
    public static void tearDownClass()
    {
    }

    @Before
    public void setUp()
    {
    }

    @After
    public void tearDown()
    {
    }

    /**
     * Test of encodeString method, of class CeasarCipher.
     */
    @Test
    public void testEncodeString()
    {
        System.out.println("encodeString");
        String input = "Now is the time. 4 July 1776.";
        int shift = 5;
        String expResult = "Stb nx ymj ynrj. 9 Ozqd 6221.";
        String result = CeasarCipher.encodeString(input, shift);
        assertEquals(expResult, result);
    }

}
