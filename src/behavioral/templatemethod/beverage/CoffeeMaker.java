package behavioral.templatemethod.beverage;

public class CoffeeMaker implements BeverageMaker {

    @Override
    public String getBeverageName() {
        return "Coffee";
    }

    @Override
    public void boilWater() {
        System.out.println("Boiling water");
    }

    @Override
    public void brew() {
        System.out.println("Brewing coffee");
    }

    @Override
    public void pourInCup() {
        System.out.println("Pouring coffee into cup");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    // Optional: Override hook method to add additional steps
    // @Override
    // public void addOptionalSteps() {
    // System.out.println("Adding whipped cream");
    // System.out.println("Sprinkling cocoa powder");
    // }
}
