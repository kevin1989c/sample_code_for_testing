package myCalendar;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestCalendarBean {

	
	@Test
	public void testBeanM1Y2009(){
		CalendarBean cal = new CalendarBean();
	    cal.setYear(2009);
		cal.setMonth(1); 
		String[] ts=cal.getCalendar();
		int sum=0;	
		for(String t:ts){
			int a=0;
			if(t!=null)
			try {
			     a = Integer.parseInt(t);
			} catch (NumberFormatException e) {
			    
			}  
			sum+=a;	
		}	
	//	System.out.println(sum);
		Assert.assertEquals(sum,496);
		}
	
	
	@Test
	public void testBeanM2Y2009(){
		CalendarBean cal = new CalendarBean();
	    cal.setYear(2009);
		cal.setMonth(2); 
		String[] ts=cal.getCalendar();
		int sum=0;	
		for(String t:ts){
			int a=0;
			if(t!=null)
			try {
			     a = Integer.parseInt(t);
			} catch (NumberFormatException e) {
			    
			}  
			sum+=a;	
		}	
		Assert.assertEquals(sum,406);
		}
	
	@Test
	public void testBeanM3Y2009(){
		CalendarBean cal = new CalendarBean();
	    cal.setYear(2009);
		cal.setMonth(3); 
		String[] ts=cal.getCalendar();
		int sum=0;	
		for(String t:ts){
			int a=0;
			if(t!=null)
			try {
			     a = Integer.parseInt(t);
			} catch (NumberFormatException e) {
			    
			}  
			sum+=a;	
		}	
		Assert.assertEquals(sum,496);
		}
	
	
	@Test
	public void testBeanM4Y2009(){
		CalendarBean cal = new CalendarBean();
	    cal.setYear(2009);
		cal.setMonth(4); 
		String[] ts=cal.getCalendar();
		int sum=0;	
		for(String t:ts){
			int a=0;
			if(t!=null)
			try {
			     a = Integer.parseInt(t);
			} catch (NumberFormatException e) {
			    
			}  
			sum+=a;	
		}	
		Assert.assertEquals(sum,465);
		}
	
	
	@Test
	public void testBeanM5Y2009(){
		CalendarBean cal = new CalendarBean();
	    cal.setYear(2009);
		cal.setMonth(5); 
		String[] ts=cal.getCalendar();
		int sum=0;	
		for(String t:ts){
			int a=0;
			if(t!=null)
			try {
			     a = Integer.parseInt(t);
			} catch (NumberFormatException e) {
			    
			}  
			sum+=a;	
		}	
		Assert.assertEquals(sum,496);
		}
	
	
	
	
	@Test
	public void testBeanM6Y2009(){
		CalendarBean cal = new CalendarBean();
	    cal.setYear(2009);
		cal.setMonth(6); 
		String[] ts=cal.getCalendar();
		int sum=0;	
		for(String t:ts){
			int a=0;
			if(t!=null)
			try {
			     a = Integer.parseInt(t);
			} catch (NumberFormatException e) {
			    
			}  
			sum+=a;	
		}	
		Assert.assertEquals(sum,465);
		}
	
	@Test
	public void testBeanM7Y2009(){
		CalendarBean cal = new CalendarBean();
	    cal.setYear(2009);
		cal.setMonth(7); 
		String[] ts=cal.getCalendar();
		int sum=0;	
		for(String t:ts){
			int a=0;
			if(t!=null)
			try {
			     a = Integer.parseInt(t);
			} catch (NumberFormatException e) {
			    
			}  
			sum+=a;	
		}	
		Assert.assertEquals(sum,496);
		}
	
	
	@Test
	public void testBeanM8Y2009(){
		CalendarBean cal = new CalendarBean();
	    cal.setYear(2009);
		cal.setMonth(8); 
		String[] ts=cal.getCalendar();
		int sum=0;	
		for(String t:ts){
			int a=0;
			if(t!=null)
			try {
			     a = Integer.parseInt(t);
			} catch (NumberFormatException e) {
			    
			}  
			sum+=a;	
		}	
		Assert.assertEquals(sum,496);
		}
	
	@Test
	public void testBeanM9Y2009(){
		CalendarBean cal = new CalendarBean();
	    cal.setYear(2009);
		cal.setMonth(9); 
		String[] ts=cal.getCalendar();
		int sum=0;	
		for(String t:ts){
			int a=0;
			if(t!=null)
			try {
			     a = Integer.parseInt(t);
			} catch (NumberFormatException e) {

			}  
			sum+=a;	
		}	
		Assert.assertEquals(sum,465);
		}
	
	@Test
	public void testBeanM10Y2009(){
		CalendarBean cal = new CalendarBean();
	    cal.setYear(2009);
		cal.setMonth(10); 
		String[] ts=cal.getCalendar();
		int sum=0;	
		for(String t:ts){
			int a=0;
			if(t!=null)
			try {
			     a = Integer.parseInt(t);
			} catch (NumberFormatException e) {
			   
			}  
			sum+=a;	
		}	
		Assert.assertEquals(sum,496);
		}
	
	@Test
	public void testBeanM11Y2009(){
		CalendarBean cal = new CalendarBean();
	    cal.setYear(2009);
		cal.setMonth(11); 
		String[] ts=cal.getCalendar();
		int sum=0;	
		for(String t:ts){
			int a=0;
			if(t!=null)
			try {
			     a = Integer.parseInt(t);
			} catch (NumberFormatException e) {

			}  
			sum+=a;	
		}	
		Assert.assertEquals(sum,465);
		}
	
	@Test
	public void testBeanM12Y2009(){
		CalendarBean cal = new CalendarBean();
	    cal.setYear(2009);
		cal.setMonth(12); 
		String[] ts=cal.getCalendar();
		int sum=0;	
		for(String t:ts){
			int a=0;
			if(t!=null)
			try {
			     a = Integer.parseInt(t);
			} catch (NumberFormatException e) {

			}  
			sum+=a;	
		}	
		Assert.assertEquals(sum,496);
		}
	
	@Test
	public void testBeanM2Y1820(){
		CalendarBean cal = new CalendarBean();
	    cal.setYear(1820);
		cal.setMonth(2); 
		String[] ts=cal.getCalendar();
		int sum=0;	
		for(String t:ts){
			int a=0;
			if(t!=null)
			try {
			     a = Integer.parseInt(t);
			} catch (NumberFormatException e) {

			}  
			sum+=a;	
		}	
		Assert.assertEquals(sum,435);
		}
	
	@Test
	public void testBeanM2Y2000(){
		CalendarBean cal = new CalendarBean();
	    cal.setYear(2000);
		cal.setMonth(2); 
		String[] ts=cal.getCalendar();
		int sum=0;	
		for(String t:ts){
			int a=0;
			if(t!=null)
			try {
			     a = Integer.parseInt(t);
			} catch (NumberFormatException e) {

			}  
			sum+=a;	
		}	
		Assert.assertEquals(sum,435);
		}
	@Test
	public void testBeanM2Y2100(){
		CalendarBean cal = new CalendarBean();
	    cal.setYear(2100);
		cal.setMonth(2); 
		String[] ts=cal.getCalendar();
		int sum=0;	
		for(String t:ts){
			int a=0;
			if(t!=null)
			try {
			     a = Integer.parseInt(t);
			} catch (NumberFormatException e) {

			}  
			sum+=a;	
		}	
		Assert.assertEquals(sum,406);
		}
	
	@Test
	public void testBeanM2Y2101(){
		CalendarBean cal = new CalendarBean();
	    cal.setYear(2101);
		cal.setMonth(2); 
		String[] ts=cal.getCalendar();
		int sum=0;	
		for(String t:ts){
			int a=0;
			if(t!=null)
			try {
			     a = Integer.parseInt(t);
			} catch (NumberFormatException e) {
			    
			}  
			sum+=a;	
		}	
		Assert.assertEquals(sum,406);
		}
}
	
	
	

  

