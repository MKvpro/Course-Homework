package Arena;

public class Arena {
    public static void main(String[] args) throws InterruptedException {
        Warrior warrior1 = new Gladiator("Spartacus");
        Warrior warrior2 = new Squire();
        Magician mag = new FireMag();


        System.out.println(mag);
        System.out.println(warrior1);

        while (mag.isAlive() && warrior1.isAlive()) {
            Thread.sleep(3000);
            mag.attack(warrior1);
            warrior1.attack(mag);
            System.out.println(mag.toShortString());
            System.out.println(warrior1.toShortString());
        }

        if (warrior1.isAlive()) {
            System.out.println(warrior1.getName() + " is a winner");
        } else {
            System.out.println(mag.getName() + " is a winner");
        }
    }
}