//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() throws Exception {
    Scanner keyboard = new Scanner(System.in);
    final int ID = 0;
    final int name = 1;
    final int BASE = 0;
    final int SUDANG = 1;
    final int SALARY = 2;
    final int TAX = 3;
    final int NET = 4;

    String[][] employees = {

            {"1111", "홍길동"}, {"1111", "홍길동"}, {"1111", "홍길동"},
            {"1111", "홍길동"}, {"1111", "홍길동"}, {"1111", "홍길동"},
            {"1111", "홍길동"}, {"1111", "홍길동"}, {"1111", "홍길동"},
            {"1111", "홍길동"}
    };

    char[] grade = {'1', '5', '4', '3', '2', '1', '5', '4', '3', '2'};
    int[][] salary = {
            {0, 700000, 0, 0, 0}, {0, 1000000, 0, 0, 0}, {0, 750000, 0, 0, 0},
            {0, 700000, 0, 0, 0}, {0, 700000, 0, 0, 0}, {0, 700000, 0, 0, 0},
            {0, 700000, 0, 0, 0}, {0, 700000, 0, 0, 0}, {0, 700000, 0, 0, 0},
            {0, 700000, 0, 0, 0}
    };

    int[] MONEY = {1650000, 1680000, 1700000, 1720000, 1750000};

    // 1. 업무 수당 입력 (0 ~ 1,000,000원)
    int count = 0;
    while (count < employees.length) {
        System.out.printf(" %s 사원의 업무 수당 입력 : ", employees[count][name]);
        salary[count][SUDANG] = keyboard.nextInt();

        if (salary[count][SUDANG] >= 0 && salary[count][SUDANG] <= 1000000)
            count++;
        else {
            System.err.println("ERROR");
            System.in.read();
        }
    }

    // 2. 호봉별 기본급 설정
    for (int i = 0; i < employees.length; i++) {
        if (grade[i] == '1') {
            salary[i][BASE] = MONEY[0];
        } else if (grade[i] == '2') {
            salary[i][BASE] = MONEY[1];
        } else if (grade[i] == '3') {
            salary[i][BASE] = MONEY[2];
        } else if (grade[i] == '4') {
            salary[i][BASE] = MONEY[3];
        } else if (grade[i] == '5') {
            salary[i][BASE] = MONEY[4];
        } else {
            salary[i][BASE] = 0;
        }
    }

    // 3. 급여액 계산
    for (int i = 0; i < employees.length; i++)
        salary[i][SALARY] = salary[i][BASE] + salary[i][SUDANG];

    // 4. 세금 계산 (100원 이하 버림)
    for (int i = 0; i < employees.length; i++) {
        int temp = salary[i][SALARY] - (int) (salary[i][SALARY] * 15.0f / 100);
        if (temp < 1600000) {
            salary[i][TAX] = (int) (temp * 3.3f / 100);
        } else if (temp < 2300000) {
            salary[i][TAX] = (int) (temp * 7.5f / 100);
        } else {
            salary[i][TAX] = (int) (temp * 10.2f / 100);
        }
        salary[i][TAX] = (salary[i][TAX] / 100) * 100;
    }

    // 5. 지급액 계산
    for (int i = 0; i < employees.length; i++)
        salary[i][NET] = salary[i][SALARY] - salary[i][TAX];

    // 6. 지급액 기준 내림차순 정렬 (많은 사람 -> 작은 사람)
    for (int i = 0; i < employees.length; i++) {
        for (int j = 0; j < employees.length - (i + 1); j++) {
            if (salary[j][NET] < salary[j + 1][NET]) {
                String[] tmp = employees[j + 1];
                employees[j + 1] = employees[j];
                employees[j] = tmp;

                char tmp1 = grade[j + 1];
                grade[j + 1] = grade[j];
                grade[j] = tmp1;

                int[] tmp2 = salary[j + 1];
                salary[j + 1] = salary[j];
                salary[j] = tmp2;
            }
        }
    }

    // 7. 출력 및 합계(보너스) 누적
    int[] sum = new int[5];
    System.out.println("**********************************************************************");
    System.out.println(" 사번   이름  호봉      기본급    업무수당      급여액      세금      지급액");
    System.out.println("**********************************************************************");
    for (int i = 0; i < employees.length; i++) {
        System.out.printf(" %4s %4s %4c %,10d %,10d %,10d %,8d %,10d\n",
                employees[i][ID], employees[i][name], grade[i],
                salary[i][BASE], salary[i][SUDANG], salary[i][SALARY],
                salary[i][TAX], salary[i][NET]);

        for (int k = 0; k < 5; k++) {
            sum[k] += salary[i][k];
        }
    }
    System.out.println("**********************************************************************");
    System.out.printf(" 합계            %,10d %,10d %,10d %,8d %,10d\n",
            sum[BASE], sum[SUDANG], sum[SALARY], sum[TAX], sum[NET]);
    System.out.println("**********************************************************************");
}
