package cisc181.lab_5;

import java.util.ArrayList;

public class Grocer {
    private ArrayList<Edible> items;

    public Grocer() {
        items = new ArrayList<Edible>();
    }

    public void addEdibleItem(Edible edibleItem) {
        items.add(edibleItem);
    }

    public String getEdibleList() {
        StringBuffer buffer = new StringBuffer();
        for (Edible ed : items) {
            buffer.append(ed.toString());
            buffer.append('\n');
        }
        return buffer.toString();
    }

    public static void main(String[] args) {
        Grocer grocery = new Grocer();
        grocery.addEdibleItem(new StrawberryShortcake());
        grocery.addEdibleItem(new Blueberry(45));
        grocery.addEdibleItem(new Cranberry(40));
        System.out.println(grocery.getEdibleList());
    }


}
