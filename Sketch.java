import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method	
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(66, 135, 245);	
  }
 
  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	
	//ellipse(width/2, height/2, width, height);

    //sand
	  stroke(240,230,140);
    fill(240,230,140);
    rect(0,250, 400, 300);

    //sand using variables
    stroke(width/1.6,height/1.7,height/2.8);
    fill(240,230,140);
    rect(0,250, 400, 300);
 /*   
    //waves  
    stroke(66, 135, 245);
    fill(66, 135, 245);
    ellipse(0,220, 400, 100);
    
    stroke(66, 135, 245);
    fill(66, 135, 245);
    ellipse(250,220, 400, 100);
    
    stroke(66, 135, 245);
    fill(66, 135, 245);
    ellipse(470,220, 400, 100);
    
//  grass
    stroke(55, 135, 39);
    fill(55, 135, 39);
    bezier(400,200, 400,500,500, 500, 200, 400);
    
    
//  sun
    stroke(230, 255, 8);
    fill(230, 255, 8);
    ellipse(0, 0, 200, 200);  
    
    //tree
    stroke(165,42,42);
    fill(165,42,42);
    rect(300,200,20,150);
    
    stroke(45, 201, 14);
    fill(45, 201, 14);
    ellipse(310,200,50,50);
    
    stroke(45, 201, 14);
    fill(45, 201, 14);
    ellipse(280,200,50,50);
    
    stroke(45, 201, 14);
    fill(45, 201, 14);
    ellipse(340,200,50,50);
    
    stroke(45, 201, 14);
    fill(45, 201, 14);
    ellipse(310,170,50,50);
*/
    
    
    
   
      
  }
  
  // define other methods down here.
}