public class RightTriangleRunner {
    public static void main(String[] args) {
        RightTriangle triangle1 = new RightTriangle(3, 4);
        RightTriangle triangle2 = new RightTriangle(6.5, 10.7);

        double hypotenuse1 = triangle1.hypotenuse();
        double hypotenuse2 = triangle2.hypotenuse();

        System.out.println(hypotenuse1);
        System.out.println(hypotenuse2);

        RightTriangle triangle3 = new RightTriangle(5, 12);
        double hypotenuse3 = triangle3.hypotenuse();
        System.out.println(hypotenuse3);
    }
}
