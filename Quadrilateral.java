public abstract class Quadrilateral {
 public static final int NUMSIDES = 4;
 public static final int INT_ANG_SUM = 360;
 private int[] sides;
 private int[] angles;

 public Quadrilateral(int[] sides , int[] angles){
     this.sides = sides;
     this.angles = angles;
 }

 public int calcPerimeter(){
     int per = 0;
     for (int s : sides) {
         per += s;
     }
     return per;
 }
 public abstract double calcArea();

    public int getAngles(int g) {
        return angles[g];
    }

    public int getSides(int s) {
        return sides[s];
    }
    public String toString(){
        String result =  "Quadrilateral: ";
        for (int s : sides) {
            result += s + " ";
        }
        return result;
    }
    /*
    public static void main(String[] args) {
        int[] sides = {3 , 4 , 5 , 6};
        int [] angles = {90 , 90 , 80 , 100};
        Quadrilateral q =new Quadrilateral(sdes ,angles);
    }
    */
}