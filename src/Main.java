void main() {
  for (int i = 0; i < 3; i++) {
    System.out.println("Hello World!");
  }

  Scanner scanner = new Scanner(System.in);
  System.out.println("What is your age?");

  int age = 0;

  try{
    age = scanner.nextInt();
  }catch (Exception e){
    System.out.println("Choose correct age. Exeption: " + e);
    return;
  }

  scanner.close();

  if(age >= 0 && age < 18){
    System.out.println("You're a child.");
  }else if(age >= 18){
    System.out.println("You're an adult.");
  }else{
    System.out.println("What?");
  }
}