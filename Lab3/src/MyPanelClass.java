import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
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
                        g.setColor(Color.blue);
                        g.fillRect(x1, y1, width, height);
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
                      
                      g.setColor(Color.LIGHT_GRAY);
                      g.fillOval(x1 = 60, y1 =40 , width = 55, height = 55 );
                       



            }			
			
}