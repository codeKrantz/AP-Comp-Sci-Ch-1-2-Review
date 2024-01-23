// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

class Main {
    public static void main(String[] args) {
      int result = 13 - 3 * 6 / 4 % 3;
      System.out.println(result);
      // result is 12 because 3 * 6 = 18, 18 / 4 = 4.5, 4.5 % 3 = 1.5, 13
      
  
  
  
  
      double answer = (double) (13 / 5);
      System.out.println("13 / 5 = " + answer);
  // answer is not 2.6 because 13 / 5 = 2.6, but we are casting the result as a double, so it elimiates the decimall leaving 2.0
  
  
      System.out.println("Math: ");
      System.out.println(24 / 5 % 3 * 2);
      System.out.println(12 / 3 * 2 + 1);
      System.out.println(1 + 4 % 3 * 2);
      System.out.println(5%3);
  
  
  
  // Question 7 Which of the following will print after the following code is executed? 
  /*
  Which of the following will print after the following code is executed?
  
  String str = new String(“superstar”);
    System.out.print(str.substring(1, 3) + “ “);
    str.substring(1);
    System.out.print(str.substring(1, 3) + “ “);
    str.substring(1);
    System.out.print(str.substring(1, 3) + “ “);
  
  A. su up pe
  B up pe er
  C sup upe per
  D up up up
  E A StringIndexOutOfBoundsException will occur
  
      */
  
      String str = new String("superstar");
      System.out.print(str.substring(1, 3) + " ");
      str.substring(1);
      System.out.print(str.substring(1, 3) + " ");
      str.substring(1);
      System.out.println(str.substring(1, 3) + " ");
  
  // My answewr is D
  //D is the correct answer because the code prints out the part of the string starting at the index of 1 and ending at index 3, which is up, the substring method does not mutate the original string in any way.
  
  
  
  
  
  /*
  
  (8) Consider the following code segment. Line 4 will not compile. With which of the following statements could we replace it so that it compiles?
  
  int a = 15;
    double b = 5.3;
    double c = a / b
  
  double c = (double) a / b;
  double c = a / b;
  double c = a / (int) b;
  int c = a / b;
  int c = a / (int) b;
  
  
      */
  
      int a = 15;
      double b = 5.3;
      double c = a / b;
      System.out.println(c);
  
  
  
  
      /*
  
  (9) What is printed as a result of the following code segment?
  
    int a = 13;
    int b = 5;
    double x = 13;
    double y = 5;
    System.out.print(a / b);
    System.out.print(“ “);
    System.out.print(x / y);
    System.out.print(“ “);
    System.out.print(x / b);
  
  2 2.6 2.6
  2.6 2.6 2.6
  2 3 2
  3 3 3
  3 2.6 3
  
  
  
      
      */
  
  
      int A = 13;
      int B = 5;
      double x = 13;
      double y = 5;
      System.out.print(A / B);
      System.out.print(" ");
      System.out.print(x / y);
      System.out.print(" ");
      System.out.print(x / B);
  
  
  
  
  
  
  
      String word1 = "Vanderah is awesome";
      String word2 = word1.substring(0, 8);
      String word3 = word1.substring(word1.length() - 7);
      String word4 = word2.substring(5);
      System.out.println(word4);
  
  
    }
  
    // @Test
    // void addition() {
    //     assertEquals(2, 1 + 1);
    // }
  }