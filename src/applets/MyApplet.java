package applets;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class MyApplet extends java.applet.Applet {
	
public void paint(Graphics g) {
		g.setColor(Color.green);
		g.fill3DRect(0, 0, getWidth() - 1, getHeight() - 1, true);
		
		g.setColor(Color.decode("0x0000ff"));
		g.drawString("Hello Applet��", 20, 20);
		
		g.setColor(new Color(200, 20, 155));
		g.drawString("��ã��Զ�����ɫ��", 20, 40);
		
		Image img = getImage(this.getClass().getResource("1.jpg"));
		g.drawImage(img, 20, 60, this);
	}

}

