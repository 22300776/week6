import java.util.Random;
import java.util.Scanner;

class Lotto {//J041
    int[] numbers;
    int[] renumbers;
    int[] input;
    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    public Lotto(){
        numbers = new int[6]; // numbers 배열 초기화
        for(int i=0; i<6; i++){
            numbers[i] = random.nextInt(45) + 1;
        }
    }

    public void printNumbers(){
        System.out.printf("오늘의 당첨 번호 : %d %d %d %d %d %d\n", numbers[0], numbers[1], numbers[2], numbers[3], numbers[4], numbers[5]);
    }

    public void remakeAuto(){
        renumbers = new int[6]; // numbers 배열 초기화
        for(int i=0; i<6; i++){
            renumbers[i] = random.nextInt(45) + 1;
        }
        System.out.printf("자동 생성 : %d %d %d %d %d %d", renumbers[0], renumbers[1], renumbers[2], renumbers[3], renumbers[4], renumbers[5]);
    }

    public void remake(){ //J042
        input = new int[6];
        for(int i=0;i<6;i++){
            input[i] = sc.nextInt();
        }
        System.out.printf("내가 작성한 번호 : %d %d %d %d %d %d\n", input[0], input[1], input[2], input[3], input[4], input[5]);
    }

    public int checkLotto(int[] check) {
        int matchCount = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (numbers[i] == check[j]) {
                    matchCount++;
                    break;
                }
            }
        }
        return matchCount;
    }

    public static void main(String[] args){
        Lotto lotto = new Lotto();
        lotto.remake();
        lotto.printNumbers();
        lotto.remakeAuto();
        int matchCount=lotto.checkLotto(lotto.input);
        System.out.printf("\n일치하는 번호의 개수: %d\n", matchCount);
        if (matchCount == 6) {
            System.out.println("축하합니다! 1등 당첨입니다!");
        } else {
            System.out.println("아쉽지만, 다음 기회에...");
        }
        
    }
}
