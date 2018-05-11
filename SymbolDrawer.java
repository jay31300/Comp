// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a COMP102 assignment.
// You may not distribute it in any other way without permission.

/* Code for COMP102 - 2018T1
 * Name: Jaynesh Patel
 * Username: pateljayn3
 * ID: 300433093
 */

import ecs100.*;
import java.awt.Color;

/**
 * Draws various symbols: flags, signs, and car logos
 *
 * You can find lots of flag details (including the correct dimensions and colours)
 * from  http://www.crwflags.com/fotw/flags/    
 */
public class SymbolDrawer{

    /**   CORE
     * Draw the flag of France.
     * The flag has three vertical stripes;
     * The left is blue, the right is red and the middle is white.
     * The flag is 2/3 as high as it is wide (ratio 2:3).
     */
    public void drawFranceFlag(double left, double top, double width){
        double height = width*2.0/3.0 ; //This drwas a black rect
        UI.setColor(Color.black);
        UI.drawRect(left, top, width, height);
        
        UI.setColor(Color.blue); //This colours the blue strip
        UI.fillRect(left, top, width/3, height);
        
        UI.setColor(Color.red);
        UI.fillRect(left+width*2/3, top, width/3, height);

    }

    /**   CORE
     * Draw the hospital sign - a blue square with a big white centred H.
     * The H is made of 3 rectangular strips
     */
    public void drawHospitalSign(double left, double top, double size) {
        UI.setColor(Color.blue); //this draws a blue square
        UI.fillRect(left, top, size, size);
        
        UI.setColor(java.awt.Color.white); //This draws left vert of H
        UI.fillRect(left+size/4, top+size/5, size/7.5, size*3/5);
        
        UI.setColor(java.awt.Color.white); //This draws right vert of H
        UI.fillRect(left+size*3/4-size/7.5, top+size/5, size/7.5, size*3/5);
        /** UI.fillRect(left, top, horz, vert) */
        UI.setColor(java.awt.Color.white); //This draws horz part of H
        UI.fillRect(left+size/4, top+size/2-size/15, size/2, size/7.5);

    } 

    /**   CORE
     * Draw the flag of Laos.
     * The flag has three horizontal stripes with a white circle in the centre;
     * See the assignment for the dimensions.
     */
    public void drawLaosFlag(double left, double top, double width) {
        /** UI.fillRect(left, top, horz, vert) */
        double height = width*2.0/3.0 ; //This draws a red horz 
        UI.setColor(Color.black);
        UI.drawRect(left, top, width, height);
        UI.setColor(Color.red);
        UI.fillRect(left, top, width, height);
        
        UI.setColor(Color.blue); //This draws the blue middle
        UI.fillRect(left, top+height/4, width, height/2);
        
        UI.setColor(java.awt.Color.white);
        //Augest Helped with circle
        UI.fillOval(left+width/2-height/5, top+height*3/10, height*2/5, height*2/5); 
    }

    /**   COMPLETION
     * Draw the flag of the United Arab Emirates.
     * The flag has a vertical red stripe on the left, and
     * three horizontal stripes (green, white, black) on the right.
     * See the assignment for dimensions and details.
     */
    public void drawUaeFlag(double left, double top, double width) {
        /** UI.fillRect(left, top, horz, vert) */
        double horz = width *3.0/2.3;
        double height = width*2.0/3.0 ;
        UI.setColor(Color.black);
        UI.drawRect(left, top, horz, height);//Draws a sqaure box around
        
        UI.setColor(java.awt.Color.white);
        UI.fillRect(left, top+height/3, horz, height/3);//Draws middle White horz

        
        UI.setColor(java.awt.Color.green.darker());
        UI.fillRect(left, top, horz, height*1/3);
        
        UI.setColor(Color.black);
        UI.fillRect(left, top+height*2/3, horz, height/3);//Draws Black bottom 
        
        
        UI.setColor(Color.red); //Draws red strip
        UI.fillRect(left, top, width/3, height);

    }

    /**   COMPLETION
     * Draw the flag of Greenland.
     * The top half of the flag is white, and the bottom half is red.
     * There is a circle in the middle (off-set to left)  which is
     * also half white/red but on the opposite sides.
     * See the assignment for dimensions
     */
    public void drawGreenlandFlag(double left, double top, double width) {
        double startAngle = 270;
        double arcAngle = 90;
        
        double height = width*2.0/3.0 ;
        UI.setColor(Color.black);
        UI.drawRect(left, top, width, height);//Draws a sqaure box around
        
        UI.setColor(Color.red);
        UI.fillRect(left, top+height/2, width, height/2);//Draws 
        
        UI.setColor(Color.red);
        UI.fillArc (left+width/5, top+height/5, height*6/10, height*6/10, 0, 180);
        
        UI.setColor(java.awt.Color.white);
        UI.fillArc (left+width/5, top+height/5, height*6/10, height*6/10, 180, 180);
        
        

    }

    /**   CHALLENGE
     * Draw the Misubishi Logo.
     */
    public void drawMitsubishiLogo(double left, double top, double size) {
        
        double [] x0 = {100,300,500}; // Array for first main triangle(whole symbol);
        double [] y0 = {500,100,500};
        double [] x1 = {245,300,355}; // Array for second triangle - Middle Centre
        double [] y1 = {500,350,500};
        double [] x2 = {300,363,425}; // Array for third triangle - Top Right
        double [] y2 = {350,225,350};
        double [] x3 = {175,237,300}; // Array for fourth tringle - Top Left
        double [] y3 = {350,225,350};

        UI.setColor(Color.red);
        UI.fillPolygon(x0,y0,3); // Draws large red initial triangle.
        UI.setColor(Color.white);
        UI.fillPolygon(x1,y1,3); // Draws middle center triangle 
        UI.fillPolygon(x2,y2,3); // Draws top right triangle
        UI.fillPolygon(x3,y3,3); // Draws top left triangle
        
        /** 
         * 
         * Tried to scale but didnt work as planned
         * 
        UI.setColor(Color.red);
        // how wide L, R, top of point
        double[] xCord = {100-size/8,130 + size/8,115}; //
        //   off the topL,topR,depth 
        double[] yCord ={130,130,100 - size/4};
        int numPoints = 3;
        UI.fillPolygon (xCord, yCord, numPoints);
        
        
        double[] xCordTL1 = {105,115,110};  //TL1 - triangle left 1
        double[] yCordTL1 ={120-size/12,120-size/12,110-size/12};
        UI.setColor(java.awt.Color.white);
        UI.fillPolygon (xCordTL1, yCordTL1, numPoints);
        
        double[] xCordTR1 = {115,125,120};  //TR1 - triangle left 1
        double[] yCordTR1 ={120-size/12,120-size/12,110-size/12};
        UI.setColor(java.awt.Color.white);
        UI.fillPolygon (xCordTR1, yCordTR1, numPoints);
        
        double[] xCordTB1 = {110-size/24,120+size/24,115}; //TB1 - Triangle bottom 1
        double[] yCordTB1 ={130,130,120-size/12};
        UI.setColor(java.awt.Color.white);
        UI.fillPolygon (xCordTB1, yCordTB1, numPoints);
        
        
        */

    }

    /**   CHALLENGE
     * Draw the Koru Flag.
     * It was one of the new flag designs for the 2016 referendum,
     * designed by Sven Baker from Wellington
     * The flag is 1/2 as high as it is wide (ratio 1:2).
     */
    public void drawKoruFlag(double left, double top, double width) {
        
        double height = width*2.0/4.0 ;
        
        UI.setColor(java.awt.Color.red);
        UI.fillRect(left, top, width/2, height);
        
        UI.setColor(java.awt.Color.blue.darker());
        UI.fillRect(left+width*50/100, top, width*50/100, height);
        
        UI.setColor(java.awt.Color.white);
        UI.fillOval(left+width/3-height/6, top-height/18, height+height*1/18, height+height*1/18);
        
        UI.setColor(Color.blue.darker());
        UI.fillOval(left+width/2-height*38/100, top+height*8/100, height*8/10, height*8/10);
        
        UI.setColor(java.awt.Color.blue.darker()); //Blue arch lookalike
        UI.fillOval(left+width*61/100, top+height*43/100, height*32/100, height*32/100);
        
        UI.setColor(java.awt.Color.white); //White littlest circle
        UI.fillOval(left+width*61/100, top+height*40/100, height*32/100, height*32/100);

        UI.setColor(java.awt.Color.white); //Bottom white circle cut
        UI.fillRect (left, top+height*19/20, width, height*8/10);
        
        UI.setColor(java.awt.Color.white); //Bottom white circle cut
        UI.fillRect (left, top-height*16/20, width, height*8/10);
        
        
        
        
        
        
        


    }


}
