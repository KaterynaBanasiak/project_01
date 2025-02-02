package task_01;

public class main {
    public static void main(String[] args) {


        int a = 10;

        if (a < 20) {
            System.out.println("Body of first if");
        }

        System.out.println("Code after first if");

        if (a > 20) {
            System.out.println("Body of second if");
        }

        System.out.println("Code after second if");

        boolean result = a == 30;


        if (result) {
            System.out.println("Body of third if");
        }

        result = a != 40;
        System.out.println("Body of fourth if");
    }
}
