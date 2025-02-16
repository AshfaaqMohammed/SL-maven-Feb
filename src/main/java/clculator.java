public class clculator {
    public int add(int a, int b){
        return a+b;
    }
    public int diff(int a, int b){
        return a-b;
    }
    public static void main(String[] args){
        clculator cal = new clculator();
        System.out.println("Sum is = "+cal.add(20,10));
        System.out.println("difference is = "+cal.diff(100,10));
    }
}
