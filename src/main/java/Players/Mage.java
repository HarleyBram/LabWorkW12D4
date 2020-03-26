package Players;

public abstract class Mage extends Player{
    protected Spell spell;
    protected Defender defender;
    public Mage(String name, int healthPoints) {
        super(name, healthPoints);
        this.defender = new Defender();
        this.spell = new Spell();
    }

    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    public Defender getDefender() {
        return defender;
    }

    public void setDefender(Defender defender) {
        this.defender = defender;
    }
}
