import java.awt.Color;

import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.CYAN);
                        g.fillRect(x1, y1, width+1, height+1);
                        //Draw a border
//                        g.setColor(Color.YELLOW);
//                        g.drawRect(x1+20, y1+20, x2-40, y2-40);      
//                        g.setColor(Color.RED);
//                        g.drawRect(x1, y1, width, height);
//                        g.setColor(Color.green);
//                        g.drawLine(x1, y1, x2, y2);
//                      
//                        g.setColor(Color.PINK);
//                        g.drawLine(x1, y1 + height, x2, y2 - width + 23);    
                      
//                        g.setColor(Color.LIGHT_GRAY);
//                        g.fillOval(x1 = 60, y1 =40 , width = 55, height = 55 );
//                        Polygon p = new Polygon();
//                        p.addPoint(x1 + 5, y1 + 25);
//                        p.addPoint(x1 + 20, y1 + 10);
//                        p.addPoint(x1 + 35, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 25);
//                        g.setColor(Color.YELLOW);
//                        g.fillPolygon(p);
//                        Polygon p2 = new Polygon();
//                        p2.addPoint(x1 + 25, y1 + 73);
//                        p2.addPoint(x1 + 41, y1 + 73);
//                        p2.addPoint(x1 + 47, y1 + 58);
//                        p2.addPoint(x1 + 53, y1 + 73);
//                        p2.addPoint(x1 + 69, y1 + 73);
//                        p2.addPoint(x1 + 56, y1 + 83);
//                        p2.addPoint(x1 + 61, y1 + 98);
//                        p2.addPoint(x1 + 47, y1 + 88);
//                        p2.addPoint(x1 + 34, y1 + 98);
//                        p2.addPoint(x1 + 38, y1 + 83);
//                        g.setColor(Color.WHITE);
//                        g.drawPolygon(p2);
                                                                      
                        g.setColor(Color.WHITE);
                        g.fillRect(x1 + 20, y1 + 40, width - 120, height - 233);  
                        
                        g.setColor(Color.WHITE);
                        g.fillRect(x1 + 20, y1 + 100, width - 120, height - 233);                     
                        
                        
                          
                        Polygon p4 = new Polygon();
                        p4.addPoint(x1, y1);
                        p4.addPoint(x1 + 115, y1 + 68);
                        p4.addPoint(x1, y1 + 125 );
                        g.setColor(Color.BLUE);
                        g.fillPolygon(p4); 
                         
                          
                        Polygon p3 = new Polygon();
                        p3.addPoint(x1 + 35, y1 + 38);
                        p3.addPoint(x1+25, y1+55);
                        p3.addPoint(x1+15, y1+55);
                        p3.addPoint(x1+25, y1+70);
                        p3.addPoint(x1+21, y1+85);
                        p3.addPoint(x1+35, y1+75);
                        p3.addPoint(x1+49, y1+85);
                        p3.addPoint(x1+45, y1+70);
                        p3.addPoint(x1+55, y1+55);
                        p3.addPoint(x1+43, y1+55);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p3);
                        
                        Polygon p5 = new Polygon();
                        p5.addPoint(x1, y1);
                        p5.addPoint(x1+250, y1);
                        p5.addPoint(x1+250, y1+25);
                        p5.addPoint(x1+40, y1+25);
                        g.setColor(Color.RED);
                        g.fillPolygon(p5);
                        
                        Polygon p6 = new Polygon();
                        p6.addPoint(x1+40, y1+25);
                        p6.addPoint(x1+250, y1+25);
                        p6.addPoint(x1+250, y1+50);
                        p6.addPoint(x1+85, y1+50);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p6);

                        Polygon p7 = new Polygon();
                        p7.addPoint(x1+85, y1+50);
                        p7.addPoint(x1+250, y1+50);
                        p7.addPoint(x1+250, y1+70);
                        p7.addPoint(x1+115, y1+70);
                        g.setColor(Color.RED);
                        g.fillPolygon(p7);

                        Polygon p8 = new Polygon();
                        p8.addPoint(x1+110, y1+70);
                        p8.addPoint(x1+250, y1+70);
                        p8.addPoint(x1+250, y1+85);
                        p8.addPoint(x1+80, y1+85);
                        g.setColor(Color.RED);
                        g.fillPolygon(p8);

                        Polygon p9 = new Polygon();
                        p9.addPoint(x1+80, y1+85);
                        p9.addPoint(x1+250, y1+85);
                        p9.addPoint(x1+250, y1+105);
                        p9.addPoint(x1+40, y1+105);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p9);
                        
                        Polygon p10 = new Polygon();
                        p10.addPoint(x1+40, y1+105);
                        p10.addPoint(x1+250, y1+105);
                        p10.addPoint(x1+250, y1+125);
                        p10.addPoint(x1, y1+125);
                        g.setColor(Color.RED);
                        g.fillPolygon(p10);
            }			
			
}