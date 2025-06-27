//For loops question

public class MyNumberRunner {
    public static void main(String[] args) {

        MyNumber number  = new MyNumber(5);
        boolean isprime = number.isPrime();
        System.out.println(isprime);
        int sum = number.sumUptoN();
        System.out.println(sum);
        int div = number.sumOfDivisors();
        System.out.println(div);
        number.printANumberTriangle();



    }


}
