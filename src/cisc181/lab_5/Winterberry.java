package cisc181.lab_5;

/**
 * a class for Winterberry
 */
public class Winterberry extends Berry {
    /**
     * a constructor for berry
     *
     * color of berry all red
     * weight of berry all 0.117g
     */
    public Winterberry() {
        super("red", 0.117);
    }
    /**
     * show the harvest method
     * @return string of harvest
     */
    @Override
    public String harvestBerry() {
        return "Branch Cutting";
    }
}
