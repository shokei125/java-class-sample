package sample;

public class sample {

	public static void main(String[] args) {
		Unit fighter = new Fighter();
		Unit magician = new Magician();
		Unit priest = new Priest();

		System.out.println("---Turn Begin---");
		System.out.println("1.Fighter's Turn");
		fighter.execute();
		System.out.println("2.Magician's Turn");
		magician.execute();
		System.out.println("3.Priest's Turn");
		priest.execute();
		System.out.println("---Turn End---");
	}

}
