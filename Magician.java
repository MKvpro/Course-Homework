package Arena;

public abstract class Magician extends Warrior{
    public Magician(){
        super("Merlin", 3, 120);
    }
    int mana = 20;
    int cooldown = 0;
    int magicAttack = 95;

}
