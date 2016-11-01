package naive;

import org.testng.annotations.Test;

public class Testmain {
	@Test
	public void Testmain1(){
		Naive n = new Naive() ;
		Naive.x=100;
		Naive.y=100;
		Naive.z=100;
		n.main();
	}
	@Test
	public void Testmain2(){
		Naive n = new Naive() ;
		Naive.x=200;
		Naive.y=200;
		Naive.z=200;
		n.main();
	}
	@Test
	public void Testmain3(){
		Naive n = new Naive() ;
		Naive.x=500;
		Naive.y=10;
		Naive.z=500;
		n.main();
	}
	@Test
	public void Testmain4(){
		Naive n = new Naive() ;
		Naive.x=90;
		Naive.y=100;
		Naive.z=90;
		n.main();
	}


}
