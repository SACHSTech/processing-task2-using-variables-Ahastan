import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method	
   */
  public void settings() {
	// put your size call here
    size(600,600);
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
	
	//ellipse(width/2.2, height/2, width, height);

    //sand
    stroke(240,230,140);
    fill(240,230,140);
    rect(0,height/1.6f, width, height-100);

    //waves
    stroke(66, 135, 245);
    fill(66, 135, 245);
    ellipse(0, width/1.8f, height, width - 300);
   
    stroke(66, 135, 245);
    fill(66, 135, 245);
    ellipse(width/1.6f,height/1.8f, height, height-300);
    
    stroke(66, 135, 245);
    fill(66, 135, 245);
    ellipse(width/0.85f, height/1.8f, height, width - 300);
     
//  grass
    stroke(55, 135, 39);
    fill(55, 135, 39);
    bezier(width,height/2, width, height/0.8f, width/0.8f, height/0.8f, width/2, height);
    
     
//  sun
    stroke(230, 255, 8);
    fill(230, 255, 8);
    ellipse(0, 0, height/2, width/2);  
  
    //tree
    stroke(165,42,42);
    fill(165,42,42);
    rect(width/1.33f, height/2, width/20, height/2.7f);
    
    stroke(45, 201, 14);
    fill(45, 201, 14);
    ellipse(width/1.29f , height/2 , width/8 , height/8);
    
    stroke(45, 201, 14);
    fill(45, 201, 14);
    ellipse(width/1.43f, height/2 , width/8 , width/8);
    
    stroke(45, 201, 14);
    fill(45, 201, 14);
    ellipse(width/1.17f, height/2 , width/8 , height/8);
    
    stroke(45, 201, 14);
    fill(45, 201, 14);
    ellipse(width/1.29f, height/2.35f, width/8, height/8);

    
    
    
   
      
  }
  
  // define other methods down here.
}