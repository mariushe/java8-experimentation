/**
 * Lambda as return value
/*
class CalculatorExample {

  public static void main(String[] args) {

      CalculatorExample calculatorExample = new CalculatorExample();
      calculatorExample.doExample();
  }

  public void doExample() {

    CalculatorMethod addCalc = CalculatorFactory.createAddCalculator();
    CalculatorMethod subtractCalc = CalculatorFactory.createSubtractCalculator();

    System.out.println("Result of adding 5 and 3 is " + addCalc.calculate(5,3));
    System.out.println("Result of subtracting 3 from 5 is " + subtractCalc.calculate(5,3));
  }

  public static class CalculatorFactory {

    public static CalculatorMethod createAddCalculator() {
      return (x, y) -> x + y;
    }

    public static CalculatorMethod createSubtractCalculator() {
      return (x, y) -> x - y;
    }
  }

  public interface CalculatorMethod {
    public int calculate(int x, int y);
  }
}
