void main() {
    Scanner keyboard = new Scanner(System.in);
    int radius; // 원의 반지름
    double area;  // 소수점 들어가면 더블.


    System.out.print("원의 반지름 입력 (정수형) ? ");
    radius = keyboard.nextInt();

    area = 3.141592 * radius * radius;

    System.out.printf("원의 반지름 : %,d cm, 면적 : %,.2f \u33A0\n", radius, area);

}
