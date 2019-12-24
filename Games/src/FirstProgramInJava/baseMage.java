package FirstProgramInJava;

public abstract class baseMage {
		
	private String name;
	private double life;
	private double mana;
	private double atk;
	private double def;

	public baseMage(String name, double life, double mana, double atk, double def) {
		this.name = name;
		this.life = life;
		this.mana = mana;
		this.atk = atk;
		this.def = def;		
	}
	
	public void Atack() {		
		System.out.println("Ola " + Players.getName());
		System.out.println(name + " has been atacked, your life: " + life);
	}

}
