package cisc181.lab_5;

/**
 * a class for berry
 */
abstract public class Berry {
    private String color;
    private double grams;

    /**
     * a constructor for berry
     *
     * @param color color of berry
     * @param grams weight of berry
     */
    public Berry(String color, double grams) {
        this.color = color;
        this.grams = grams;
    }

    /**
     * an accessor methods to get color
     *
     * @return berry color
     */
    public String getColor() {
        return color;
    }

    /**
     * an accessor methods to get grams
     *
     * @return berry weight
     */
    public double getGrams() {
        return grams;
    }

    abstract public String harvestBerry();

    @Override
    public boolean equals(Object obj) {
        Berry berry = (Berry) obj;

        return berry.color.equals(this.color) && berry.grams == this.grams;
    }

}
