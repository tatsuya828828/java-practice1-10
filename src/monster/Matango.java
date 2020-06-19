package monster;

public class Matango {
	String name;
	public int hp;

	public Matango(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	public Matango() {
		this("おばけきのこ", 40);
	}
}
