package finalpaint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;


import javax.swing.JColorChooser;
import javax.swing.JComponent;
 
/**
* Component for drawing !
*
* @author sylsau
*
*/
public class DrawArea extends JComponent {
	
  // Image in which we're going to draw
  private Image image;
  // Graphics2D object ==> used to draw on
  protected Graphics2D g2;
  // Mouse coordinates
  private int currentX, currentY, oldX, oldY;
 private Color color;
  public DrawArea() {
    setDoubleBuffered(false);
 
  }
 
  
 
  // now we create exposed methods
  public void clear() {
    g2.setPaint(Color.white);
    // draw white on entire draw area to clear
    g2.fillRect(0, 0, getSize().width, getSize().height);
    g2.setPaint(Color.black);
    repaint();
  }
  public void colorbtn(){
	  Color initialcolor=Color.BLACK;  
	  color=JColorChooser.showDialog(this,"Select a color",initialcolor);  
	  g2.setPaint(color);
  }
  public void rectbtn(){
	 
	  setDoubleBuffered(false);
	  addMouseListener(new MouseAdapter() {
	      public void mousePressed(MouseEvent e) {
	        // save coord x,y when mouse is pressed
	        oldX = e.getX();
	        oldY = e.getY();
	      }
	    });
	  addMouseListener(new MouseAdapter(){
		  public void mouseReleased(MouseEvent e){
			  currentX=e.getX();
			  currentY=e.getY();
			 if(g2!=null){
				
				  int width=Math.abs(currentX-oldX);
				  int height=Math.abs(currentY-oldY);
				  g2.drawRect(oldX, oldY, width, height);
				  repaint();
				  
				
			 }
		  }
		  
	  });
	  
	  
  }
  public void pencilbtn(){
	  
	    setDoubleBuffered(false);
	    addMouseListener(new MouseAdapter() {
	      public void mousePressed(MouseEvent e) {
	        // save coord x,y when mouse is pressed
	        oldX = e.getX();
	        oldY = e.getY();
	      }
	    });
	 
	    addMouseMotionListener(new MouseMotionAdapter() {
	      public void mouseDragged(MouseEvent e) {
	        // coord x,y when drag mouse
	        currentX = e.getX();
	        currentY = e.getY();
	 
	        if (g2 != null) {
	        	
	          // draw line if g2 context not null
	          g2.drawLine(oldX, oldY, currentX, currentY);
	          // refresh draw area to repaint
	          repaint();
	          // store current coords x,y as olds x,y
	          oldX = currentX;
	          oldY = currentY;
	         
	        }
	        
	      }
	    }); 
	  
}
  public void f_rectbtn(){
	  
	  setDoubleBuffered(false);
	  addMouseListener(new MouseAdapter() {
	      public void mousePressed(MouseEvent e) {
	        // save coord x,y when mouse is pressed
	        oldX = e.getX();
	        oldY = e.getY();
	      }
	    });
	  addMouseListener(new MouseAdapter(){
		  public void mouseReleased(MouseEvent e){
			  currentX=e.getX();
			  currentY=e.getY();
			  if(g2!=null){
				 
				  int width=Math.abs(currentX-oldX);
				  int height=Math.abs(currentY-oldY);
				  g2.fillRect(oldX, oldY, width, height);
				  repaint();
				 
			  }
		  }
		  
	  });
	  
	  
  }
  public void circlebtn(){
	  setDoubleBuffered(false);
	  addMouseListener(new MouseAdapter() {
	      public void mousePressed(MouseEvent e) {
	        // save coord x,y when mouse is pressed
	        oldX = e.getX();
	        oldY = e.getY();
	      }
	    });
	  addMouseListener(new MouseAdapter(){
		  public void mouseReleased(MouseEvent e){
			  currentX=e.getX();
			  currentY=e.getY();
			  if(g2!=null){
				
				  int width=Math.abs(currentX-oldX);
				  int height=Math.abs(currentY-oldY);
				  g2.drawOval(oldX, oldY, width, height);
				  repaint();
				 
			  }
		  }
		  
	  });
	  
	  
  }
  public void f_circlebtn(){
	  setDoubleBuffered(false);
	  addMouseListener(new MouseAdapter() {
	      public void mousePressed(MouseEvent e) {
	        // save coord x,y when mouse is pressed
	        oldX = e.getX();
	        oldY = e.getY();
	      }
	    });
	  addMouseListener(new MouseAdapter(){
		  public void mouseReleased(MouseEvent e){
			  currentX=e.getX();
			  currentY=e.getY();
			  if(g2!=null){
				  
				  int width=Math.abs(currentX-oldX);
				  int height=Math.abs(currentY-oldY);
				  g2.fillOval(oldX, oldY, width, height);
				  repaint();
				  }
		  }
		  
	  });
	  
  }
  public void eraserbtn(){
	  setDoubleBuffered(false);
	    addMouseListener(new MouseAdapter() {
	      public void mousePressed(MouseEvent e) {
	        // save coord x,y when mouse is pressed
	        oldX = e.getX();
	        oldY = e.getY();
	      }
	    });
	 
	    addMouseMotionListener(new MouseMotionAdapter() {
	      public void mouseDragged(MouseEvent e) {
	        // coord x,y when drag mouse
	        currentX = e.getX();
	        currentY = e.getY();
	 
	        if (g2!= null) {
	          // draw line if g2 context not null
	        	g2.setColor(Color.WHITE);
	          g2.fillRect(10,10,10,10);
	          // refresh draw area to repaint
	          
	          repaint();
	          // store current coords x,y as olds x,y
	          oldX = currentX;
	          oldY = currentY;
	          color=Color.BLACK;
	        }
	        
	      }
	    }); 
	  
  }
  public void polygonbtn(){
	  
  }
  public void linebtn(){
	  setDoubleBuffered(false);
	  addMouseListener(new MouseAdapter() {
	      public void mousePressed(MouseEvent e) {
	        // save coord x,y when mouse is pressed
	        oldX = e.getX();
	        oldY = e.getY();
	      }
	    });
	  addMouseListener(new MouseAdapter(){
		  public void mouseReleased(MouseEvent e){
			  currentX=e.getX();
			  currentY=e.getY();
			  if(g2!=null){
			
				  g2.drawLine(oldX, oldY, currentX,currentY);
				  repaint();
				  
			  }
		  }
		  
	  });
  }

  
  protected void paintComponent(Graphics g) {
	  
	  if (image == null) {
	      // image to draw null ==> we create
	      image = createImage(getSize().width, getSize().height);
	      g2 = (Graphics2D) image.getGraphics();
	      // enable antialiasing
	      g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	      // clear draw area
	      clear();
	    }
	  	
	    g.drawImage(image, 0, 0, null);
	    
	  }
}