//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);

    int total, price, tax;
    System.out.print("판매금액을 입력하세요: ");
    total = keyboard.nextInt();

    price = total / 11 * 10;
    tax = total - price;

    System.out.printf("금액 : %,d원\n", price);
    System.out.printf("세금 : %,d원", tax);

    keyboard.close();
}
