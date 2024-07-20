import java.util.Scanner;

public class DuplicateChar {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String val = input.nextLine();
        char data[] = val.toCharArray();
        for(int i=0;i<data.length-1;i++) {
            if(data[i]==data[i+1]) {
                System.out.println(data[i+1]+" "+i+1);
                break;
            }
        }

    }
}
