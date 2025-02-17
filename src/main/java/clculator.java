public class clculator {
    public int add(int a, int b){
        return a+b;
    }
    public int diff(int a, int b){
        return a-b;
    }
    public int mult(int a, int b){
        return a*b;
    }
    public int div(int a, int b){
        return a/b;
    }
    public void show(){
        System.out.println("Hello Jenkins");
    }
    public static void main(String[] args){
        clculator cal = new clculator();
        System.out.println("Sum is = "+cal.add(20,10));
        System.out.println("difference is = "+cal.diff(100,10));
        System.out.println("Multiply is = "+cal.mult(6,9));
        System.out.println("Divide is = "+cal.div(25,5));
    }
}
