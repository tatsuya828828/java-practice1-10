package quest;

public class PoisonMatango extends Matango {

	int poisonAttack = 5;

	public PoisonMatango(char suffix) {
		super(suffix);
	}

	public void attack(Hero h) {
		super.attack(h);

		if(poisonAttack != 0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			int damage = h.hp/5;
			h.hp-=damage;
			System.out.println(damage+"のダメージ！");
			this.poisonAttack-=1;
		}
	}
}
