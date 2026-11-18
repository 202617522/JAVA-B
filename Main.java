//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    int[] step11 = new int[]{3, 3, 3, 0};
    int[] step12 = new int[]{3, 3, 3};
    int[] step13 = new int[]{3, 3, 3};
    int[] step14 = new int[]{3, 3, 3};
    int[] step15 = new int[]{3, 3, 3};

    int[] step21 = new int[]{3, 3, 3, 0};
    int[] step22 = new int[]{3, 3, 3, 0};
    int[] step23 = new int[]{3, 3, 3, 0};
    int[] step24 = new int[]{3, 3, 3, 0};
    int[] step25 = new int[]{3, 3, 3, 0};

    int[] step31 = new int[]{3, 3, 3, 0};
    int[] step32 = new int[]{3, 3, 3, 0};
    int[] step33 = new int[]{3, 3, 3, 0};
    int[] step34 = new int[]{3, 3, 3, 0};
    int[] step35 = new int[]{3, 3, 3, 0};

    int[][] villaA = {step11, step12, step13, step14, step15};
    int[][] villaB = {step21, step22, step23, step24, step25};
    int[][] villaC = {step31, step32, step33, step34, step35};
    int[][][] somangvilla = new int[][][]{{
            {3, 3, 3, 0},
            {3, 3, 3, 0},
            {3, 3, 3, 0},
            {3, 3, 3, 0},
            {3, 3, 3, 0}},
            {step21, step22, step23, step24, step25},
            {step31, step32, step33, step34, step35}
    };

    int[][] stepTotal = new int[somangvilla.length][];
    stepTotal[0] = new int[villaA.length];
    stepTotal[1] = new int[villaB.length];
    stepTotal[2] = new int[villaC.length];
    int[] dongTotal = new int[somangvilla.length];
    int total = 0;

    for (int i = 0; i < somangvilla.length; i++) {
        for (int j = 0; j < somangvilla[i].length; j++) {
            for (int k = 0; k < somangvilla[i][j].length - 1; k++) {
                somangvilla[i][j][3] += somangvilla[i][j][k];
                stepTotal[i][j] += somangvilla[i][j][k];
            }
        }
    }

    for (int i = 0; i < stepTotal.length; i++)
        for (int j = 0; j < stepTotal.length; j++)
            dongTotal[i] += stepTotal[i][j];

    for (int i = 0; i < dongTotal.length; i++)
        total += dongTotal;

    for (int i = 0; i < somangvilla.length; i++) {
        System.out.printf(">>>> %d동 주민수 <<<< \n", i + 1);

        for (int j = 0; j < somangvilla.length; j++) {
            System.out.printf("%d층 \n", j + 1);

            for (int k =0; k < somangvilla[i][j].length)
        }
    }
}