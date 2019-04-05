/**
  Represent a date
 */
public class Date implements Comparable{
    private int y,m,d;

    /**
      @return  a negative integer, zero, or a positive integer
      depending on whether this Date is closer,
      equidistant, or farther from January 1, 0 than the Date referred
      to by the parameter.
     */
    public int compareTo( Object otherObj) {
        Date otherDate = (Date) otherObj;
        if (y > otherDate.y) {
            return 1;
        }
        else if (y < otherDate.y) {
            return -1;
        }
        else {
            if (m > otherDate.m) {
                return 1;
            }
            else if (m < otherDate.m) {
                return -1;
            }
            else {
                if (d > otherDate.d) {
                    return 1;
                }
                else if (d < otherDate.d) {
                    return -1;
                }
                else {
                    return 0;
                }
            }
        }
    }


    // -------- previously-written code --------
    // constructor
    public Date( int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    /**
      @return a string representation of this instance
     */
    public String toString() {
        // ISO 8601 rules!
        return String.format("%4d-%02d-%02d",y, m, d);
    }

}
