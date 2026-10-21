//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("정수 3개를 입력하세요: ");
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        int c = keyboard.nextInt();

        String result = (a > 0 && b > 0 && c > 0) ? "모두 양수"
                : (a == 0 && b == 0 && c == 0) ? "모두 0"
                : (a < 0 || b < 0 || c < 0) ? "음수 포함"
                : "나머지 경우";

        System.out.printf(result);
    }

