package behavioral.templatemethod;

import behavioral.templatemethod.beverage.BeverageMaker;
import behavioral.templatemethod.beverage.CoffeeMaker;
import behavioral.templatemethod.beverage.TeaMaker;

public class TemplateMethodDemo {

    public static void run() {
        System.out.println("START: Template Method demo -------------");
        BeverageMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.makeBeverage();
        
        BeverageMaker teaMaker = new TeaMaker();
        teaMaker.makeBeverage();
        System.out.println("END: Template Method demo -------------");
    }
}
