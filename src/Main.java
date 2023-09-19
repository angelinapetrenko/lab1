import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        MyContainer container = new MyContainer ();
        Scanner scan = new Scanner(System.in);
        System.out.println("Write count of values: ");
        int values = scan.nextInt();
        for (int i = 0; i < values; i++) {
            System.out.println("Enter the next values: ");
            container.add(scan.nextInt());
        }
        container.get(3);
        container.removeAt(4);
    }
}
