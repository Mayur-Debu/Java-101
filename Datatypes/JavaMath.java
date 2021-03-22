public class JavaMath {
    public static void main(String[] args) {
        
        double randomNum =  (Math.random() *100);
        System.out.println( (int) randomNum);

        System.out.println(Math.sqrt(randomNum));
        System.out.println(Math.min(10,20)); // minimum of only two numbers
        System.out.println(Math.max(10,20)); // Maximum of only two numbers
    }
}
