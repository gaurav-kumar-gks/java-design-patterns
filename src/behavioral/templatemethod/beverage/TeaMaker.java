package behavioral.templatemethod.beverage;

public class TeaMaker implements BeverageMaker {

    @Override
    public String getBeverageName() {
        return "Tea";
    }

    @Override
    public void boilWater() {
        System.out.println("Boiling water");
    }

    @Override
    public void brew() {
        System.out.println("Brewing tea");
    }

    @Override
    public void pourInCup() {
        System.out.println("Pouring tea into cup");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding lemon");
    }

    @Override
    public void addOptionalSteps() {
        System.out.println("Adding honey");
    }
}
