package finalexplored.consumer.specific;

import finalexplored.generic.BaseClass;

public class ChildClass extends BaseClass {
    @Override
    protected void optionalMethod() {
        System.out.println("[Child:optionalMethod] EXTRA Stuff Here");
        super.optionalMethod();
    }

    private void mandatoryMethod() {
        System.out.println("[Child:mandatoryMethod] My own important stuff");
    }
}
