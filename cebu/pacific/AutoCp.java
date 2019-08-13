package org.cebu.pacific;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.adac.bin.BaseClass;
import org.junit.Test;

public class AutoCp extends BaseClass {
@Test 
public void cp1() throws Throwable {
	driverget();
	putUrl("https://book.cebupacificair.com/");
	printUrl();
	printTitle();
	maxScreen();
	
	CpPage1 cp=new CpPage1();
	
	click(cp.getSigin());
	textBox(cp.getUser(), "manzoorahmed234@gmail.com");
	textBox(cp.getPass(), "Manz7401520904");
	click(cp.getLogbuttn());
	click(cp.getBflight());
	
	Thread.sleep(5000);
	
	Robot e=new Robot();
	e.keyPress(KeyEvent.VK_ENTER);
	e.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(5000);
	
	textBox(cp.getFinput(), "china");
	Thread.sleep(5000);
	e.keyPress(KeyEvent.VK_ENTER);
	e.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(5000);
	
	textBox(cp.getTinput(), "japan");
	Thread.sleep(5000);
	e.keyPress(KeyEvent.VK_ENTER);
	e.keyRelease(KeyEvent.VK_ENTER);
	
	click(cp.getSdate());
	Thread.sleep(5000);
	click(cp.getSdated());
	
	Thread.sleep(5000);
	for (int i = 0; i < 2; i++) {
		e.keyPress(KeyEvent.VK_RIGHT);
		e.keyRelease(KeyEvent.VK_RIGHT);
	}

	e.keyPress(KeyEvent.VK_ENTER);
	e.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(10000);
	for (int i = 0; i < 2; i++) {
		click(cp.getAdult());
	}
	Thread.sleep(10000);
	for (int i = 0; i < 2; i++) {
		click(cp.getInfant());
	}
	
	click(cp.getFflights());
	
	

	
	
	
}
}
