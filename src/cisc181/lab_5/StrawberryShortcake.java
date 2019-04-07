package cisc181.lab_5;

/**
 * a class for StrawberryShortcake
 */
public class StrawberryShortcake implements Edible{
    /**
     * to get the full calories
     * @return calories for one
     */
    @Override
    public double getCalories() {
        return 300;
    }

    /**
     * override the method to print string
     * @return Strawberry Shortcake
     */
    @Override
    public String toString() {
        return "Strawberry Shortcake";
    }
}
