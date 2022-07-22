public class LoopsBreakContinue {
    public static void main(String[] args) {

        //Break the loop before the end
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
            if (i == 2) {
                break;
            }
        }

        //Continue - for skipping current iteration of loop
        for (int i = 0; i <= 10; i++) {

            if (i == 4){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
