//Peter Breissinger
//Period H
//February 22, 2016

import java.awt.*;
import java.applet.*;


public class Lab04bst extends Applet
{

    public void paint(Graphics g)
    {
        //DRAW CUBE
           g.drawRect(100,100,200,200);
           g.drawRect(200,200,200,200);
           g.drawLine(100,100,200,200);
           g.drawLine(300,300,400,400);
           g.drawLine(100,300,200,400);
           g.drawLine(300,100,400,200);
          
         
           
        


        // DRAW SPHERE
          g.drawOval(300,400,100,100);
          g.drawOval(313,400,75,100);
          g.drawOval(325,400,50,100);
          g.drawOval(337,400,25,100);
          g.drawOval(300,413,100,75);
          g.drawOval(300,425,100,50);
          g.drawOval(300,437,100,25);



        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE
          g.drawOval(500,500,200,200);
          g.drawLine(500,600,700,600);
          g.drawLine(500,600,600,500);
          g.drawLine(700,600,600,500);
          g.drawOval(558,517,83,83);



        // DRAW APCS
          
          //The letter A
          g.drawRect(200,550,50,15);
          g.fillRect(200,550,50,15);
          g.drawRect(200,550,17,100);
          g.fillRect(200,550,17,100);
          g.drawRect(200,600,50,15);
          g.fillRect(200,600,50,15);
          g.drawRect(250,550,17,100);
          g.fillRect(250,550,17,100);
          
          //The letter P
          g.drawRect(275,550,50,15);
          g.fillRect(275,550,50,15);
          g.drawRect(275,550,17,100);
          g.fillRect(275,550,17,100);
          g.drawRect(275,600,50,15);
          g.fillRect(275,600,50,15);
          g.drawRect(325,550,17,65);
          g.fillRect(325,550,17,65);
          
          
          
          //The letter C
          g.drawRect(350,550,50,15);
          g.fillRect(350,550,50,15);
          g.drawRect(350,550,17,100);
          g.fillRect(350,550,17,100);
          g.drawRect(350,635,50,15);
          g.fillRect(350,635,50,15);
          
          //The letter S
          g.drawRect(425,550,50,15);
          g.fillRect(425,550,50,15);
          g.drawRect(425,550,17,50);
          g.fillRect(425,550,17,50);
          g.drawRect(425,590,50,15);
          g.fillRect(425,590,50,15);
          g.drawRect(458,600,17,50);
          g.fillRect(458,600,17,50);
          g.drawRect(425,635,50,15);
          g.fillRect(425,635,50,15);
          
          
          
          
          
          
          
          
      
   



        // DRAW PACMEN FLOWER



    }

}