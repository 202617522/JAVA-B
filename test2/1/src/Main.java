//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("당신의 JAVA 점수 입력 : ");
    int score = keyboard.nextInt();

    // if문 대신 삼항 연산자와 논리 연산자(&&) 활용
    String grade = (score >= 95) ? "A+" :
            (score >= 90) ? "A" :
                    (score >= 85) ? "B+" :
                            (score >= 80) ? "B" :
                                    (score >= 75) ? "C+" :
                                            (score >= 70) ? "C" :
                                                    (score >= 65) ? "D+" :
                                                            (score >= 60) ? "D" : "F";

    System.out.printf("\n입력 점수 : " + score);
    System.out.printf("학점 : " + grade);

}
