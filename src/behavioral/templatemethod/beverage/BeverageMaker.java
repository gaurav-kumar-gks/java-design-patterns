package behavioral.templatemethod.beverage;

public interface BeverageMaker {

    // Will need to use abstract class to make template method final
    default void makeBeverage() {
        System.out.println("Making beverage: " + getBeverageName());
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        addOptionalSteps();
    }

    String getBeverageName();

    void boilWater();

    void brew();

    void pourInCup();

    void addCondiments();

    default void addOptionalSteps() {
    }
}
