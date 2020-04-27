public class ExampleException {
  public static int rectangleArea(int a, int b) throws IllegalArgumentException {
    int c;
    try {
      if (a <= 0 || b <= 0) {
        throw new IllegalArgumentException();
      } else {
        c = a * b;
        return c;
      }
    } catch (IllegalArgumentException e) {
      System.out.println("input value is below zero!");
      return -10;
    }
  }
}

