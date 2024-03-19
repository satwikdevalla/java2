public class Swapping {
    public static void main(String[] args) {
        int a = 200, b = 300;
        
        System.out.println("Before swapping:");
        System.out.println("a = " + a + ", b = " + b);
        
        // Swapping without using a third variable and (+ and -) operators
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        
        System.out.println("After swapping:");
        System.out.println("a = " + a + ", b = " + b);
    }
}
