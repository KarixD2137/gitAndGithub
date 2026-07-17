void main() {
    for (int i = 0; i < 3; i++) {
        System.out.println("Hello World!");
    }

    System.out.println();
    for (int i = 0; i < 10; i++) {
        System.out.println(i + 1);
    }
    System.out.println();
  Scanner scanner = new Scanner(System.in);
  System.out.println("What is your age?");

  int age = 0;

    Scanner scanner = new Scanner(System.in);
    System.out.println("What is your age?");

    int age;
    try {
        age = scanner.nextInt();
        if (age >= 0 && age < 18) {
            System.out.println("You're a child.");
        } else if (age >= 18) {
            System.out.println("You're an adult.");
        } else {
            System.out.println("What?");
        }
    } catch (InputMismatchException e) {
        System.out.println("Please enter valid number");
        scanner.nextLine(); // KLUCZOWE: czyszczenie błędnego wpisu z bufora
    }
    scanner.close();
}