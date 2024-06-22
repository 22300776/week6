import java.util.Random; 
import java.util.Scanner; 

class MakePW {
    private Random random;
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public MakePW() {
        random = new Random();
    }

    public void make(int length) {
        StringBuilder password = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(CHARACTERS.length());
            password.append(CHARACTERS.charAt(index));
        }
        System.out.println("생성된 비밀번호 " + password.toString());
    }

    public static void main(String[] args) {
        MakePW makePw = new MakePW();

        Scanner sc = new Scanner(System.in);
        System.out.println("원하는 비밀번호의 길이 : ");
        int length = sc.nextInt();
        makePw.make(length);

        sc.close();
    }
}
