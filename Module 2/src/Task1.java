public class Task1 {
    private static int number;

    public boolean Task1() {
        this.number = 20;

//        for (int i = 0; i < 10; i++) {
//            this.number = i;

            if (number % 10 == 0) {
                number++;
                return true;
            } else {
                return false;
            }
        }
        //return false;


    public static void main(String[] args) {
        System.out.println(number);
    }
}
