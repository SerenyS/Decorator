package decorator.adventuregame;

public abstract class CharacterDecorator implements GameCharacter {

    //Increase Might Spear, Sword , a Shield
    //Decrease Might Starving

    protected GameCharacter character;

    public CharacterDecorator(GameCharacter character) {
        this.character = character;
    }
}
