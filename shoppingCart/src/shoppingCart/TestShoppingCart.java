package shoppingCart;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestShoppingCart {

		

	
		
	
		Product p1 = new Product(1000,"iphone",100.0);
		Product p2 = new Product(2000,"samsung",300.0);
/*		Product p3 = new Product(3000,"HTC",600.0);
		Product p4 = new Product(4000,"Lenovo",200.0);
		Product p5 = new Product(5000,"ipad",600.0);
		Product p6 = new Product(6000,"IBM",200.0);  */
   
		
		@Test
		public void testadd1() {
			ShoppingCart cart = new ShoppingCart();
			cart.add(p1,3);
			double price1=cart.totalPrice;
			cart.print();
			Assert.assertEquals(price1,300.0);
		}
		@Test
		public void testadd2() {
			ShoppingCart cart = new ShoppingCart();
			cart.add(p1,3);
			cart.add(p1,3);
			double price2=cart.totalPrice;
			cart.print();
			Assert.assertEquals(price2,600.0);
		}
	
		@Test
		public void testadd3() {
			ShoppingCart cart = new ShoppingCart();
			cart.add(p1,3);
			cart.add(p1,3);
			cart.add(p2,3);
			double price3=cart.totalPrice;
			cart.print();
			Assert.assertEquals(price3,1500.0);
		}
		
		@Test
		public void testadd4() {
			ShoppingCart cart = new ShoppingCart();
			cart.add(p1,3);
			cart.add(p1,3);
			cart.add(p2,3);
			cart.add(p2,3);
			double price4=cart.totalPrice;
			cart.print();
			Assert.assertEquals(price4,2400.0);
		}
		@Test
		public void testRemove1() {
			ShoppingCart cart = new ShoppingCart();
			cart.add(p1,3);
			cart.add(p1,3);
			cart.remove(p1,2);
			double price5=cart.totalPrice;
			cart.print();
			Assert.assertEquals(price5,400.0);
		} 
		
		@Test
		public void testRemove2() {
			ShoppingCart cart = new ShoppingCart();
			cart.add(p1,3);
			cart.add(p1,3);
			cart.remove(p1,2);
			cart.remove(p1,4);
			double price6=cart.totalPrice;
			cart.print();
			Assert.assertEquals(price6,0.0);
		}
		
		@Test
		public void testRemove3() {
			ShoppingCart cart = new ShoppingCart();
			cart.add(p1,3);
			cart.add(p1,3);
			cart.add(p2,3);
			cart.remove(p1,2);
			cart.remove(p1,4);
			double price7=cart.totalPrice;
			cart.print();
			Assert.assertEquals(price7,900.0);
		//	Assert.assertEquals(cart.print(), expected);
		}

		@Test
		public void clear() {
			ShoppingCart cart = new ShoppingCart();
			cart.add(p1,3);
			cart.add(p1,3);
			cart.add(p2,3);
			cart.remove(p1,2);
			cart.remove(p1,4);
			cart.clear();
			double price8=cart.totalPrice;
			cart.print();
			Assert.assertEquals(price8,0.0);
		
		}

	}
	


