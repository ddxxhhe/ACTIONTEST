import java.util.Scanner;

public class Word {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(sortWord(str));
    }

    public static int sortWord(String sen) {
        int tag = 0;
        int count = 0;
        byte[] bytes = sen.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            if ((bytes[i] >= 65 && bytes[i] <= 90) ||
                    (bytes[i] >= 97 && bytes[i] <= 122)) {
                if (tag == 0) {
                    count++;
                    tag = 1;
                }
            } else {
                tag = 0;
            }
        }
        return count;
    }

}
