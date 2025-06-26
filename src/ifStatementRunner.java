public class ifStatementRunner {
    public static void main(String[] args) {
        puzzle2();

    }

    private static void puzzle1() {
        int i=0;
        int j=1;
//        if (i){
//            System.out.println("i");
//        } else if (j) {
//            System.out.println("j");
//
//        }

    }

    private static void puzzle2(){
        int number = 5;
        if(number<0) {
            number = number + 10;
            number++;
        }
            System.out.println(number);
    }
}
