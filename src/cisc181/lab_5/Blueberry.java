package cisc181.lab_5;

/**
 * a class for Blueberry
 */
public class Blueberry extends Berry implements Edible{
    /**
     * a constructor for berry
     *
     * color of berry all blue
     * @param grams weight of berry
     */
    public Blueberry(double grams) {
        super("blue", grams);
    }
    /**
     * to get the full calories
     * @return calories for one
     */
    @Override
    public String harvestBerry() {
        return "Picking";
    }
    /**
     * show the harvest method
     * @return string of harvest
     */
    @Override
    public double getCalories() {
        return 0.57 * getGrams();
    }

    /**
     * override the method to print string
     * @return Blueberry
     */
    @Override
    public String toString() {
        return "Blueberry";
    }
}
