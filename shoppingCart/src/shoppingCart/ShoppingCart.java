package shoppingCart;

import java.util.*;
public class ShoppingCart
{
	//使用Map存储商品条目.
	Map<Product,Integer> productMaps;

	//总价
	double totalPrice;

	//Constructor
	ShoppingCart(){
		productMaps = new HashMap<Product,Integer>();
	}
	

	//添加N个商品
	public void add(Product p,int n){
		//判断该购物车中是否含有该商品
		if(!productMaps.containsKey(p)){
			productMaps.put(p,n); //自动装箱
		}else{
			//车中有该商品
			int before = productMaps.get(p).intValue(); //添加商品之前的该商品数量
			int after = before + n;
			productMaps.put(p,after); //key重复value覆盖。
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
		sb.append("shopping list：\n");

		//遍历Map
		Set<Product> keys = productMaps.keySet();
		Iterator<Product> it = keys.iterator();
		while(it.hasNext()){
			Product k = it.next();
			Integer v = productMaps.get(k);
			sb.append("\t" + v.intValue() + "\t" + k + "\t" + (v.intValue()*k.getPrice())+"$\n");
		}

		sb.append("\t\t\t\t\t\t\t\t\t\t\t total：" + totalPrice+"$");

		System.out.println(sb);
		
	}

}