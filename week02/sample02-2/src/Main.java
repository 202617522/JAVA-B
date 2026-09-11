void main() {
    Scanner keyboard = new Scanner(System.in);
    String name = "";
    int age = 0;

    System.out.print("당신의 이름은 ?");
    name = keyboard.nextLine();

    System.out.printf("%s님의 나이는 ?", name);
    age = keyboard.nextInt();

    name = "홍길동";

    System.out.printf("이름 : %s, 나이 : %d살\n", name, age);
}