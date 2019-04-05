/**
  Represent a point, using Cartesian coordinates
 */
public class Point{
    private double xcor;
    private double ycor;
    
    /**
      @return  a negative integer, zero, or a positive integer
      depending on whether this Point is closer, 
      equidistant, or farther from the origin than the Point referred to
      by the parameter.
     */
    public int compareTo( Point otherObj){
        /* Use the Pythagorean theorem.
           Double.compare helped me.
           If the math is a problem, use a simpler
           relationship, like "higher is bigger"
           and change the tests accordingly */
        if (Math.sqrt((Math.pow(xcor, 2) + Math.pow(ycor, 2)))
            > Math.sqrt((Math.pow(otherObj.xcor, 2) + Math.pow(otherObj.ycor, 2)))
            ) {
          return 1;
        }
        else if (Math.sqrt((Math.pow(xcor, 2) + Math.pow(ycor, 2)))
            == Math.sqrt((Math.pow(otherObj.xcor, 2) + Math.pow(otherObj.ycor, 2)))
            ) {
          return 0;
        }
        else if (Math.sqrt((Math.pow(xcor, 2) + Math.pow(ycor, 2)))
            < Math.sqrt((Math.pow(otherObj.xcor, 2) + Math.pow(otherObj.ycor, 2)))
            ) {
          return -1;
        }
        else return 999;
        
    }

    // -------- previously-written code ----------
    // constructor
    public Point( double xcor, double ycor) {
        this.xcor = xcor;
        this.ycor = ycor;
    }
    
    /**
      @return a string representation of this instance
     */
    public String toString() {
        return "(" + xcor + "," + ycor + ")"; 
    }

}