public class Square extends Rectangle{
    public static final int SQR_ANG = 90;

    public Square(int s1){
        super(s1 , s1);

    }

    public double calcArea() {
        return getSides(0) * getSides(1);

    }
    public String toString() {
        return super.toString() + " {Square}";
    }

    public static void main(String[] args) {
        Quadrilateral[] shapes = {new Rectangle(4 , 8) , new Square(5)};
        System.out.println(shapes[0].toString());
        System.out.println(shapes[1].toString());

    }
}
