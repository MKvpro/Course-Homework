package Arena;

public class FireMag extends Magician{
    @Override
    public void attack(Warrior warrior) {
            if (mana > 0 && cooldown == 0) {
                int attack = magicAttack;
                warrior.takeDamage(attack);
                mana -= 4;
                cooldown -= 3;
            } else {
                int attack = calculateNextAttack();
                warrior.takeDamage(attack);
                cooldown++;
            }
    }
}
