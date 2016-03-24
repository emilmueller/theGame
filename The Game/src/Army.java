
public class Army {
	private String name;
	private int soliders; // = damage + health
	private int def; //defence

	public Army (String name, int soliders, int def){
		this.name=name;
		this.soliders=soliders;
		this.def=def;
	}


	public String getName(){
		return this.name;
	}
}
