package cisc181.lab_5;

/**
 * a class for WildBlueberry
 */
public class WildBlueberry extends Blueberry{

    /**
     * a constructor for berry
     * <p>
     * color of berry all blue
     *
     * @param grams weight of berry
     */
    public WildBlueberry(double grams) {
        super(grams);
    }
    /**
     * to get the full calories
     * @return calories for one
     */
    @Override
    public double getCalories() {
        return 0.35 * getGrams();
    }

}
