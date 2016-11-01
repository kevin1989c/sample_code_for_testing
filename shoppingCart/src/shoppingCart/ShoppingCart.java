package shoppingCart;

import java.util.*;
public class ShoppingCart
{
	//ʹ��Map�洢��Ʒ��Ŀ.
	Map<Product,Integer> productMaps;

	//�ܼ�
	double totalPrice;

	//Constructor
	ShoppingCart(){
		productMaps = new HashMap<Product,Integer>();
	}
	

	//���N����Ʒ
	public void add(Product p,int n){
		//�жϸù��ﳵ���Ƿ��и���Ʒ
		if(!productMaps.containsKey(p)){
			productMaps.put(p,n); //�Զ�װ��
		}else{
			//�����и���Ʒ
			int before = productMaps.get(p).intValue(); //�����Ʒ֮ǰ�ĸ���Ʒ����
			int after = before + n;
			productMaps.put(p,after); //key�ظ�value���ǡ�
		}
		totalPrice += p.getPrice()*n;
	}
	public void remove(Product p,int n){
		
		int before = productMaps.get(p).intValue();
		if(before==n){
			productMaps.remove(p);
		}else{
			int after = before - n;
			productMaps.put(p,after);
		}
		totalPrice -= p.getPrice()*n;
	}
	public void clear(){
		productMaps.clear();
		totalPrice = 0.0;
	}
	public void print(){
		StringBuffer sb = new StringBuffer();
		sb.append("shopping list��\n");

		//����Map
		Set<Product> keys = productMaps.keySet();
		Iterator<Product> it = keys.iterator();
		while(it.hasNext()){
			Product k = it.next();
			Integer v = productMaps.get(k);
			sb.append("\t" + v.intValue() + "\t" + k + "\t" + (v.intValue()*k.getPrice())+"$\n");
		}

		sb.append("\t\t\t\t\t\t\t\t\t\t\t total��" + totalPrice+"$");

		System.out.println(sb);
		
	}

}