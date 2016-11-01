package myCalendar;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class TestCalendarFrame {
	
	
	


	@Test
	public void testCfNextMonth1(){
		CalendarFrame frame=new CalendarFrame();
		frame.month=1;
		ActionEvent e = new ActionEvent(frame.nextMonth, 1,"1");
		frame.actionPerformed(e);
		//System.out.println(frame.month);
		Assert.assertEquals(frame.month,2);

	}

	@Test
	public void testCfNextMonth2(){
		CalendarFrame frame=new CalendarFrame();
		frame.month=12;
		ActionEvent e = new ActionEvent(frame.nextMonth, 1,"1");
		frame.actionPerformed(e);
		//System.out.println(frame.month);
		Assert.assertEquals(frame.month,1);

	}
	
	@Test
	public void testCfPreviousMonth1(){
		CalendarFrame frame=new CalendarFrame();
		frame.month=12;
		ActionEvent e = new ActionEvent(frame.previousMonth, 1,"1");
		frame.actionPerformed(e);
		//System.out.println(frame.month);
		Assert.assertEquals(frame.month,11);

	}
	
	@Test
	public void testCfPreviousMonth2(){
		CalendarFrame frame=new CalendarFrame();
		frame.month=1;
		ActionEvent e = new ActionEvent(frame.previousMonth, 1,"1");
		frame.actionPerformed(e);
		//System.out.println(e.getSource());
		Assert.assertEquals(frame.month,12);

	}
	
	@Test
	public void testCfButton1(){
		CalendarFrame frame=new CalendarFrame();
		frame.month=1;
		frame.text=new JTextField("1999");  
		ActionEvent e = new ActionEvent(frame.button, 1,"1");
		frame.actionPerformed(e);
		//System.out.println(e.getSource());
		Assert.assertEquals(frame.testmark, 1);

	}  


}
