package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    public void testBillableAmountForResidential()  {

        ResidentalSIte site = new ResidentalSIte();
        double result = site.getBillableAmount(100,.10);
        assertEquals(20,result,0.01);


    }

    public void testBillableAmountForLifeline()  {

        LifelineSite site = new LifelineSite();
        double result = site.getBillableAmount(100,.10);
        assertEquals(6,result,0.01);



    }
}
