package finalpaint;


import java.awt.Image;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
 
public class SwingPaint {
 
  JButton clearBtn,colorbtn,rectbtn,f_rectbtn,circlebtn,f_circlebtn,linebtn,polygonbtn,eraserbtn,pencilbtn;
  DrawArea drawArea;
  ActionListener actionListener = new ActionListener() {
 
  public void actionPerformed(ActionEvent e) {
      if (e.getSource() == clearBtn) {
      
       drawArea.clear();
      } 
      else if(e.getSource()== colorbtn){
    	 drawArea.colorbtn();;
      }
      else if(e.getSource()==polygonbtn){
    	drawArea.polygonbtn();
    	
      }
      else if(e.getSource()==linebtn){
    	drawArea.linebtn();
    	
      }
      else if(e.getSource()==rectbtn){
    	drawArea.rectbtn();
      }
      else if(e.getSource()==f_rectbtn){
    	drawArea.f_rectbtn();
      }
      else if(e.getSource()==circlebtn){
    	  drawArea.circlebtn();
      }
      else if(e.getSource()==f_circlebtn){
    	drawArea.f_circlebtn();
      }
      else if(e.getSource()==eraserbtn){
    	drawArea.eraserbtn();
      }
      else if(e.getSource()==pencilbtn){
    	drawArea.pencilbtn();
      }
    }
  };
 
  public static void main(String[] args) {
    new SwingPaint().show();
  }
 
  public void show() {
    // create main frame
    JFrame frame = new JFrame("Swing Paint");
    Container content = frame.getContentPane();
    // set layout on content pane
    content.setLayout(new BorderLayout());
    // create draw area
    drawArea = new DrawArea();
 
    // add to content pane
    content.add(drawArea, BorderLayout.CENTER);
    
    // create controls to apply colors and call clear feature
    JPanel controls = new JPanel();
    colorbtn=new JButton("Color");
    colorbtn.addActionListener(actionListener);
    clearBtn = new JButton("Clear");
    clearBtn.addActionListener(actionListener);
    rectbtn=new JButton("rectangle");
    rectbtn.addActionListener(actionListener);
    f_rectbtn=new JButton("fill rectangle");
    f_rectbtn.addActionListener(actionListener);
    circlebtn=new JButton("circle");
    circlebtn.addActionListener(actionListener);
    f_circlebtn=new JButton("fill circle");
    f_circlebtn.addActionListener(actionListener);
    polygonbtn=new JButton("polygon");
    linebtn=new JButton("line");
    linebtn.addActionListener(actionListener);
    eraserbtn=new JButton("eraser");
    eraserbtn.addActionListener(actionListener);
    pencilbtn=new JButton("pencil");
    pencilbtn.addActionListener(actionListener);
    
    // add to panel
   
    controls.add(clearBtn);
    controls.add(colorbtn);
    controls.add(rectbtn);
    controls.add(polygonbtn);
    controls.add(f_rectbtn);
    controls.add(circlebtn);
    controls.add(f_circlebtn);
    controls.add(linebtn);
    controls.add(eraserbtn);
    controls.add(pencilbtn);
    // add to content pane
    content.add(controls, BorderLayout.NORTH);
    
    frame.setSize(1500,800);
    // can close frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // show the swing paint result
    frame.setVisible(true);
 
    // Now you can try our Swing Paint !!! Enjoy <img src="http://www.ssaurel.com/blog/wp-includes/images/smilies/icon_biggrin.gif" alt=":D" class="wp-smiley">
  }
 
}