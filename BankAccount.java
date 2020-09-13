public class BankAccount {
	private String nom;
	private String nembre;
	private int argent;
	private double rate;
	
	public BankAccount(String nom, String nembre, int argent, double rate){
		this. nom = nom;
		this. nembre = nembre;
		this. argent = argent;
		this. rate = rate;
	}
	String getNom() {
		return nom;
	}
	String getNembre() {
		return nembre;
	}
	int getArgent() {
		return argent;
	}
	double getRate() {
		return rate;
	}
	
	//Èì... ¸ô¸£°Ú±º...
	
	public static void main(String[] args) {
		BankAccount b1;
		b1 = new BankAccount("Louis", "123-123456-12", 900000000, 1.2);
	}
}