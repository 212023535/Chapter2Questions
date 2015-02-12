package za.ac.cput.question1;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;


/**
 * Created by student on 2015/02/12.
 */
public  class Tester
{

    runApp myApps = new runApp();

    //execute before class
  /*  @BeforeClass
     public void beforeClass()
    {
        System.out.println("In Before Class");
    }*/

    @Test
    public void findFloat()
    {
        //given
        float num = 2000;
        Assert.assertTrue(myApps.fNum() == num);
        System.out.println("Found 2000");
    }

    @Test
    public void findInteger()
    {
        int number = 14;
        Assert.assertTrue(myApps.iNum() == number);
        System.out.println("Integer found");
    }

    @Test
    public void testEquality()
    {
        Assert.assertEquals(myApps.iNum(),14);
        System.out.print("Values are equal");
    }

    @Test
    public void testIdentity()
    {
        Assert.assertNotSame(myApps.iNum(),12);
        System.out.print("Values are NOT equal");
    }

    @Test
    public void testTrue()
    {
        Assert.assertTrue(myApps.trueReturn());
        System.out.print("Value is true");
    }

    @Test
    public void testFalse()
    {
        Assert.assertFalse(myApps.falseReturn());
        System.out.print("Value is false");
    }

    @Test
    public void testNull()
    {
        Assert.assertNull(myApps.returnNull());
        System.out.print("Value is null");
    }

    @Test
    public void testNotNull()
    {
        Assert.assertNotNull(myApps.returnNotNull());
        System.out.print("Value is not null");
    }

    @Test
    public void testFail()
    {
        Assert.fail();
        System.out.print("FAIL");
    }



    //execute after class
 /*   @AfterClass
    public static void afterClass()
    {
        System.out.println("In After Class");
    }*/
}
