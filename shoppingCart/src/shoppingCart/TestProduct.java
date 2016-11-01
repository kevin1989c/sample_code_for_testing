package shoppingCart;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestProduct {
	
	
/*	@Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp="NullPoint")
    public void testException(){
        throw new IllegalArgumentException("NullPoint");
    }   */
	@Test
	public void testP1() {

		Product p1 = new Product(1000,"iphone",100.0);
		Assert.assertEquals(p1.getName(),"iphone");
		Assert.assertEquals(p1.getNo(),1000);
		Assert.assertEquals(p1.getPrice(),100.0);
	}	
	@Test(expectedExceptions = Exception.class, expectedExceptionsMessageRegExp="the price need to be greater than 0")
	public void testP2() {

		Product p1 = new Product(1000,"iphone",-100.0);
		Assert.assertEquals(p1.getName(),"iphone");
		Assert.assertEquals(p1.getNo(),1000);
		
	}
	
	
	@Test(expectedExceptions = Exception.class, expectedExceptionsMessageRegExp="the price need to be greater than 0")
	public void testP3() {

		Product p1 = new Product(1000,"iphone",0.0);
		Assert.assertEquals(p1.getName(),"iphone");
		Assert.assertEquals(p1.getNo(),1000);

	}

	@Test(expectedExceptions = Exception.class, expectedExceptionsMessageRegExp="the price need to be greater than 0")
	public void testP4() {

		Product p1 = new Product(-1000,"iphone",100.0);
		Assert.assertEquals(p1.getName(),"iphone");
		Assert.assertEquals(p1.getPrice(),100.0);
	}

}
