
void main(){
    Scanner keyboard = new Scanner(System.in);

    System.out.print("당신의 나이는 ? ");

    int age = keyboard.nextInt();
    int fee = (age < 7 || age >= 65) ? 0 : (age <= 18) ? 1000 : 1500;

    System.out.printf("나이: %d세", age);
    System.out.printf("요금: %d원", fee);
}
