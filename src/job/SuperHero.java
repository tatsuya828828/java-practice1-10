package job;

public class SuperHero extends Hero{
	boolean flying;

	public void fly() {
		this.flying = true;
		System.out.println(this.name+"は飛び上がった！");
	}

	public void land() {
		this.flying = false;
		System.out.println(this.name+"は着地した！");
	}

	public void run() {
		System.out.println(this.name+"は、撤退した！");
	}
}
