package shoppingCart;

public class ShoppingCartMain {
	public static void main(String[] args){
		
		//�������ﳵ
		ShoppingCart cart = new ShoppingCart();
		
		//����
		Product p1 = new Product(1000,"iphone",10.0);
		Product p2 = new Product(2000,"samsung",3.0);
		Product p3 = new Product(3000,"HTC",6.0);
		Product p4 = new Product(4000,"Lenovo",2.0);
		Product p5 = new Product(5000,"ipad",6.0);
		Product p6 = new Product(6000,"IBM",2.0);

		//��ʼ����
		cart.add(p1,1);
		cart.add(p1,3);
		
		cart.add(p2,1);
		cart.add(p3,2);
		cart.add(p4,3);
		cart.add(p2,1);
		cart.add(p5,2);
		cart.add(p6,3);

		cart.remove(p1,1);

		cart.remove(p1,2);

		

		//��ӡ�굥
		cart.print();

		//���
		cart.clear();

		cart.print();

	}
}