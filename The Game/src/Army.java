
public class Army {
	private String name;
	private int Soliders; // = damage + health
	private int def; //defence

	public Army (String name, int Soliders, int def){
		this.name=name;
		this.Soliders=Soliders;
		this.def=def;
	}


	public String getName(){
		return this.name;
	}
}
