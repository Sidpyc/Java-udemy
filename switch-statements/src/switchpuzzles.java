public class switchpuzzles {

    public static void main(String[] args) {
        puzzle1();
        puzzle2();

    }
    private static void puzzle1(){
        int number = 2;
        switch (number){
            case 1:
                System.out.println(1);
                break;
            case 2:
                //Does a fall through since there are no breaks, and since case2 is empty it directly moves to case3
            case 3:
                System.out.println("Number is 2 or 3");
                break;
            default:
                System.out.println("Default");
        }
    }

    private static void puzzle2(){
        //When no cases are matched it simply returns the default
        int number = 4;
        switch (number){
            case 1:
                System.out.println(1);
                break;
            case 2:
                //Does a fall through since there are no breaks, and since case2 is empty it directly moves to case3
            case 3:
                System.out.println("Number is 2 or 3");
                break;
            default:
                System.out.println("Default");
        }
    }
}