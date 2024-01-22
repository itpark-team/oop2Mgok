public class Main {
    public static void main(String[] args) {
        TrigMath trigMath = new TrigMath();
        SimpleMath simpleMath = new SimpleMath();

        System.out.println("sum = " + simpleMath.calculateSum(3, 5));
        System.out.println("mul = " + simpleMath.calculateMul(3, 5));
        System.out.println("circle square = " + trigMath.calculateCircleSquare(32));

    }
}