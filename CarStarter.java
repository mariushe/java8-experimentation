import java.util.*;

class CarStarter {

  public static void main(String[] args) {

    CarStarter carStarter = new CarStarter();
    carStarter.startCars();
  }

  public void startCars() {

    List<Car> cars = new ArrayList<>();

    cars.add(new Car("BMW"));
    cars.add(new Car("Ferrari"));
    cars.add(new Car("Aston Martin"));

    cars.forEach(this::startEngine);
    cars.forEach((Car carToStart) -> System.out.println("Starting the " + carToStart.getName()));
  }

  public void startEngine(Car carToStart) {
    System.out.println("Starting the " + carToStart.getName());
  }


  private class Car {

    private String name;

    Car(String name) {
      this.name = name;
    }

    public String getName() {
      return name;
    }
  }
}
