

class Fact {
    public static void main(String[] args) {
  
        int i, fact = 1;


        int num = 5;

        // Calculate factorial
        for (i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + num + " is: " + fact);

        
    }
}
