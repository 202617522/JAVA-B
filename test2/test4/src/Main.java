//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("구매 금액을 입력하세요: ");
    int price = keyboard.nextInt();

    System.out.print("멤버십 회원입니까? (true/false): ");
    boolean isMember = keyboard.nextBoolean();

    String result = (price < 0)
            ? "오류: 구매 금액은 음수일 수 없습니다."
            : (price >= 50000 || (isMember && price >= 30000))
            ? "무료배송 가능"
            : "유료배송 (무료배송 대상 아님)";

    System.out.printf(result);

}
