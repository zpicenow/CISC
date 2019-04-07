package cisc181.lab_5;

/**
 * a class for Cranberry
 */
public class Cranberry extends Berry implements Edible{
    /**
     * a constructor for berry
     *
     * color of berry all red
     * @param grams weight of berry
     */
    public Cranberry(double grams) {
        super("red", grams);
    }

    /**
     * to get the full calories
     * @return calories for one
     */
    @Override
    public double getCalories() {
        return 0.46 * this.getGrams();
    }

    /**
     * show the harvest method
     * @return string of harvest
     */
    @Override
    public String harvestBerry() {
        return "Wet Harvesting";
    }

    /**
     * override the method to print string
     * @return Cranberry
     */
    @Override
    public String toString() {
        return "Cranberry";
    }
}
