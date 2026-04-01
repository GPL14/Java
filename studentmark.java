import java.util.Scanner;

public class studentmark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Student Name = ");
        String Name = sc.nextLine();

        System.out.print("Marks = ");
        int mark = sc.nextInt();
        System.out.println("Student Name = "+Name+" , "+"Marks = "+mark);
        sc.close();
    }
}
