import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Triangle myTriangle = new Triangle("blue",5,9,6);
        System.out.println(Arrays.toString(myTriangle.getThreeSide()));
    }
}