//For loops question

public class MyNumber {

     private static int number;

    public MyNumber(int number) {
        this.number = number;
    }

    public static boolean isPrime(){
        int count = 2;
        for (int i=2;i<=number/2;i++){
            if (number%i==0){
                count++;
            }
        }
        return count>2;
    }

    public static int sumUptoN(){
        int sum=0;
        for (int i=1;i<=number;i++){
            sum=sum+i;
        }
        return sum;
    }

    public static int sumOfDivisors(){
        int sum= 0;
        for (int i=2;i<number; i++){
            if(number%i==0){
                sum+=i;
            }
        }
        return sum;
    }

    public static void printANumberTriangle(){
        for(int i=1;i<=number;i++){
            for (int j=1; j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
