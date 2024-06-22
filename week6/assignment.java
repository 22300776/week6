import java.util.Scanner;

class assignment {
    public static void main(String[] args) {
        assignment pStudio = new assignment();
        // pStudio.J031();
        // pStudio.J032();
        // pStudio.J033();
        // pStudio.J034();
        // pStudio.J035();
        pStudio.J036();
    }

    void J031() {
        Scanner sc = new Scanner(System.in);

        String userid;
        String passward;
        String name;

        userid = sc.next();
        passward = sc.next();
        name = sc.next();

        if (passward.length() < 3) {
            System.out.printf("Error ! password is too short.");
        } else {
            System.out.printf("User id : %s\n", userid);
            System.out.printf("Passwaord %c%c", passward.charAt(0), passward.charAt(1));
            for (int i = 0; i < passward.length() - 2; i++) {
                System.out.printf("*");
            }
            System.out.printf("\n");

            System.out.printf("User Name : %s", name);
        }
    }

    void J032() {
        Scanner sc = new Scanner(System.in);

        String str;
        String reverse;

        str = sc.next();
        reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.printf("%s", reverse);

    }

    void J033() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] sentence = new String[n];
        for (int i = 0; i < n; i++) {
            sentence[i] = sc.nextLine();
        }

        String longest = sentence[0];
        String shortest = sentence[0];

        for (int i = 1; i < n; i++) {
            if (sentence[i].length() > longest.length()) {
                longest = sentence[i];
            }
            if (sentence[i].length() < shortest.length()) {
                shortest = sentence[i];
            }
        }

        System.out.println("Longest: " + longest);
        System.out.println("Shortest: " + shortest);
    }

    void J034() {
        Scanner sc = new Scanner(System.in);

        String usernames;// = {"kim","lee","park","hong","choi"};
        String password;// = {"1111","1234","3456","3535","7777"};

        usernames = sc.next();
        password = sc.next();

        if (usernames.equals("kim")) {
            if (password.equals("1111")) {
                System.out.printf("Login OK!");
            } else {
                System.out.printf("Incorrect password!");
            }
        }

        else if (usernames.equals("lee")) {
            if (password.equals("1234")) {
                System.out.printf("Login OK!");
            } else {
                System.out.printf("Incorrect password!");
            }
        }

        else if (usernames.equals("park")) {
            if (password.equals("3456")) {
                System.out.printf("Login OK!");
            } else {
                System.out.printf("Incorrect password!");
            }
        }

        else if (usernames.equals("hong")) {
            if (password.equals("3535")) {
                System.out.printf("Login OK!");
            } else {
                System.out.printf("Incorrect password!");
            }
        }

        else if (usernames.equals("choi")) {
            if (password.equals("7777")) {
                System.out.printf("Login OK!");
            } else {
                System.out.printf("Incorrect password!");
            }
        }

        else {
            System.out.printf("No user !");

        }

    }

    void J035() {
        Scanner sc = new Scanner(System.in);

        String YMD;
        int Y;
        int M;
        int D;

        int Final;

        YMD = sc.next();
        Y = Character.getNumericValue(YMD.charAt(0)) + Character.getNumericValue(YMD.charAt(1))
                + Character.getNumericValue(YMD.charAt(2)) + Character.getNumericValue(YMD.charAt(3));
        M = Character.getNumericValue(YMD.charAt(4)) + Character.getNumericValue(YMD.charAt(5));
        D = Character.getNumericValue(YMD.charAt(6)) + Character.getNumericValue(YMD.charAt(7));

        Final = Y + M + D;

        System.out.printf("%d", Final);

    }

    void J036() {
        Scanner sc = new Scanner(System.in);

        String input;
        String cleaned = "";

        input = sc.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                cleaned += Character.toLowerCase(ch);
            }
        }

        boolean hoimoon = true;
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                hoimoon = false;
                break;
            }
            left++;
            right--;
        }

        if (hoimoon) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
