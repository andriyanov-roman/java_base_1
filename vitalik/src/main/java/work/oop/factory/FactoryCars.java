package work.oop.factory;

/**
 * класс фабрика
 */
public class FactoryCars  {
    private String nameFactory;

    public void setNameFactory(String nameFactory) {
        this.nameFactory = nameFactory;
    }

    @Override
    public String toString() {
        return nameFactory + ":";
    }
}
