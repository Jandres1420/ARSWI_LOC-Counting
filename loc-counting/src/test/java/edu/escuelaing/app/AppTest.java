package edu.escuelaing.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;
/**
 * Unit test for simple App.
 */
public class AppTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */

    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * In this test we are prooving that with the Phy type the outpouts should be equal with the file Prueba.java
     */
    public void testingPhyType()
    {
        Phy phy= new Phy("D:\\Documentos\\ARSWI_LOC-Counting\\loc-counting\\src\\test\\java\\edu\\escuelaing\\app\\Prueba.java");
        try {
            assertEquals(phy.read(),11);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * In this test we are prooving that with the Loc type the outpouts should be equal with the file Prueba.java
     */
    public void testingLocType()
    {
        Loc loc= new Loc("D:\\Documentos\\ARSWI_LOC-Counting\\loc-counting\\src\\test\\java\\edu\\escuelaing\\app\\Prueba.java");
        try {
            assertEquals(loc.read(),7);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * In this test we are prooving that with the Phy type the outpouts should be equal with the file Prueba2.java
     */
    public void testingPhyTypeDiffJava()
    {
        Phy phy= new Phy("D:\\Documentos\\ARSWI_LOC-Counting\\loc-counting\\src\\test\\java\\edu\\escuelaing\\app\\Prueba2.java");
        try {
            assertEquals(phy.read(),6);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * In this test we are prooving that with the Loc type the outpouts should be equal with the file Prueba2.java
     */
    public void testingLocTypeDiffJava()
    {
        Loc loc= new Loc("D:\\Documentos\\ARSWI_LOC-Counting\\loc-counting\\src\\test\\java\\edu\\escuelaing\\app\\Prueba2.java");
        try {
            assertEquals(loc.read(),3);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
