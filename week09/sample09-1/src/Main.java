//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    final int SIZE = 5;
    char answer;
    String result;

    for (int i = 1; i <= SIZE; i++) {
        System.out.printf("%d번 학생 출석했나요 (Yes/No) ? ", i);
        answer = keyboard.nextLine().charAt(0);

      /*  if (answer == 'Y' || answer == 'y') {
            result = "출석";
        } else {
            result = "결석";
        }*/

        result = (answer == 'Y' || answer == 'y') ? "출석" : "결석";
        System.out.printf("%d번 학생 -> %s\n", i, result);
    }
    int j = 1;
    while (j <= SIZE) {
        System.out.printf("%d번 학생 출석했나요 (Yes/No) ? ", j++);
        answer = keyboard.nextLine().charAt(0);

        if (answer == 'Y' || answer == 'y') {
            result = "출석";
        } else {
            result = "결석";
        }
        System.out.printf("%d번 학생 -> %s\n", j, result);
    }
    int k = 1;
    do {
        System.out.printf("%d번 학생 출석했나요 (Yes/No) ? ", k++);
        answer = keyboard.nextLine().charAt(0);

        if (answer == 'Y' || answer == 'y') {
            result = "출석";
        } else {
            result = "결석";
        }
        System.out.printf("%d번 학생 -> %s\n", k, result);
    } while (k <= SIZE);
}