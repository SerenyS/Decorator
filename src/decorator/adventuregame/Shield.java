package decorator.adventuregame;

public class Shield extends CharacterDecorator {

    public Shield (GameCharacter character) {
        super(character);
    }

    @Override
    public String getName() {
        return character.getName() + ", Shield-Carrier";
    }

    @Override
    public double getMight() {
        return character.getMight() + 15;
    }
}
