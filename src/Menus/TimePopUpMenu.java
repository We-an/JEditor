package Menus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPopupMenu;

import alarm.AlarmDialog;

import Components.CMenuItem;

public class TimePopUpMenu extends JPopupMenu{

	private static final long serialVersionUID = 1L;
	private CMenuItem alarm,calendar;
	
	public TimePopUpMenu() {
		init();
		addToMenu();
		addActions();
	}
	
	public void init(){
		alarm = new CMenuItem("Set alarm", "set an alarm", 'S', null);
		calendar = new CMenuItem("Calendar", "show the calendar", 'C', null);
	}
	
	public void addToMenu(){
		add(alarm);
		add(calendar);
	}
	
	public void addActions(){
		
		alarm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				AlarmDialog.getInstance().show();
			}
		});
		
		calendar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}

}
