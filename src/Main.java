import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape myTriangle = new Triangle("blue",5,9,6);
        System.out.print(myTriangle.getArea());
        System.out.println("------------");
        Triangle myTriangle2 = new Triangle("blue",5,9,10);
        System.out.println(Arrays.toString(myTriangle2.getThreeSide()));

    }
}