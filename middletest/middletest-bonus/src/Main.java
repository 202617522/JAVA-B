//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);

    int cost;           // 매입원가
    double margin;      // 이익률
    double taxRate;     // 세율
    int price;          // 매출액
    int salesTax;       // 매출세액
    int inputTax;       // 매입세액
    int totalTax;       // 납부세액

    margin = 0.30;      // 30% 이익
    taxRate = 0.10;     // 10% 세율

    System.out.print("매입 원가 입력 : ");
    cost = keyboard.nextInt();


    price = (int) (cost * (1 + margin));
    salesTax = (int) (price * taxRate);
    inputTax = (int) (cost * taxRate);
    totalTax = salesTax - inputTax;


    System.out.printf("매입원가 : %,d 원\n", cost);
    System.out.printf("정가(매출액) : %,d 원\n", price);
    System.out.printf("매출 세액 : %,d 원\n", salesTax);
    System.out.printf("매입 세액 : %,d 원\n", inputTax);
    System.out.printf("관할 세무서에 낼 세금액 : %,d 원\n", totalTax);
}



