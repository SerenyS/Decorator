package decorator.adventuregame;

public class BasicCharacter implements GameCharacter {

    private String name;
    private double might;

    public BasicCharacter(String name) {
        this.name = name;
        this.might = 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getMight() {
        return might;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMight(double might) {
        this.might = might;
    }
}
