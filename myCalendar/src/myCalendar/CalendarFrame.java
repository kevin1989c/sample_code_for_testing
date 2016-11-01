package myCalendar;

import java.awt.*;   
import java.awt.event.*;   
import javax.swing.*;  
 
public class CalendarFrame extends JFrame implements ActionListener   
{   
       JLabel labelDay[]=new JLabel[42];   
       JTextField  text=new JTextField(10);  
       JButton titleName[]=new JButton[7];   
      JButton button = new JButton();  
       String name[]={"SUN","MON","TUE","WED", "THUR","FRI","SAT"};   
       JButton nextMonth,previousMonth;   
       int year=1996,month=1; //启动程序显示的日期信息  
       CalendarBean calendar;   
       JLabel showMessage=new JLabel("",JLabel.CENTER);   
       JLabel lbl1 = new JLabel("type in year：");  
       JLabel lbl2=new JLabel("      ");  
       
       
       int testmark = 0;//testmark
 
       public CalendarFrame()   
       {   
           JPanel pCenter=new JPanel();   
             
         //将pCenter的布局设置为7行7列的GridLayout 布局。   
           pCenter.setLayout(new GridLayout(7,7));    
             
         //pCenter添加组件titleName[i]  
           for(int i=0;i<7;i++)   
           {   
               titleName[i]=new JButton(name[i]);   
               pCenter.add(titleName[i]);   
           }   
 
         //pCenter添加组件labelDay[i]  
           for(int i=0;i<42;i++)   
           {   
               labelDay[i]=new JLabel("",JLabel.CENTER);   
               pCenter.add(labelDay[i]);  
           }   
             
           text.addActionListener(this);  
           calendar=new CalendarBean();   
           calendar.setYear(year);   
           calendar.setMonth(month);   
           String day[]=calendar.getCalendar();   
 
           for(int i=0;i<42;i++)   
           {   
               labelDay[i].setText(day[i]);   
           }   
 
           nextMonth=new JButton("next month");   
           previousMonth=new JButton("last month");   
           button=new JButton("submit");  
             
           //注册监听器  
           nextMonth.addActionListener(this);   
           previousMonth.addActionListener(this);   
           button.addActionListener(this);  
             
           JPanel pNorth=new JPanel(),  
           pSouth=new JPanel();   
           pNorth.add(showMessage);    
           pNorth.add(lbl2);    
           pNorth.add(previousMonth);   
           pNorth.add(nextMonth);   
           pSouth.add(lbl1);          
           pSouth.add(text);  
           pSouth.add(button);  
           showMessage.setText("Year:  "+calendar.getYear()+"    Month:  "+ calendar.getMonth());  
           ScrollPane scrollPane=new ScrollPane();   
           scrollPane.add(pCenter);   
           add(scrollPane,BorderLayout.CENTER);// 窗口添加scrollPane在中心区域   
           add(pNorth,BorderLayout.NORTH);// 窗口添加pNorth 在北面区域   
           add(pSouth,BorderLayout.SOUTH);// 窗口添加pSouth 在南区域。  
 
        }   
        
        public void actionPerformed(ActionEvent e)   
        {   
        	
            if(e.getSource()==nextMonth)   
            {   
                month=month+1;   
                if(month>12)   
                month=1;   
                calendar.setMonth(month);   
                String day[]=calendar.getCalendar();   
 
                for(int i=0;i<42;i++)   
                {  
                    labelDay[i].setText(day[i]);   
                }   
             }   
            else if(e.getSource()==previousMonth)   
            {   
                month=month-1;                
                if(month<1)   
                month=12;   
                calendar.setMonth(month);   
                String day[]=calendar.getCalendar();   
 
                for(int i=0;i<42;i++)   
                {   
                    labelDay[i].setText(day[i]);   
                }   
             }   
            else if(e.getSource()==button)  
            {  
              testmark = 1;  //test mark
          
                calendar.setYear(Integer.parseInt(text.getText()));               
                String day[]=calendar.getCalendar();                  
                for(int i=0;i<42;i++)  
                {  
                    labelDay[i].setText(day[i]);  
                }  
            }  
          showMessage.setText("Year:  "+calendar.getYear()+"    Month:  "+ calendar.getMonth());   
       }   
}   
 