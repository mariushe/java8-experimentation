
/**
 * Creating Result objects, where you can add a customized function to calculate on the Result object.
 */
class ResultHolder {

  public static void main(String[] args) {
    ResultHolder resultHolder = new ResultHolder();
    resultHolder.calculateValues();
  }

  public void calculateValues() {

    Result res1 = new Result(1);
    System.out.println(res1.doCalculation((x) -> (x+x)));

    Result res2 = new Result(3);
    System.out.println(res2.doCalculation((x) -> (x*x)));
  }

  public interface ResultCalculator {
    public int calculate(int value);
  }

  public class Result {

    private int value;

    public Result(int value) {
      this.value = value;
    }

    public int doCalculation(ResultCalculator calculator) {
      return calculator.calculate(value);
    }
  }
}
