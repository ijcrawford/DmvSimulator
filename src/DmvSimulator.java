public class DmvSimulator {

	public static void main(String[] args) {
		int spot = (int) Math.random() * 100;
		System.out.println("*sigh* Hi, welcome to the DMV...\n"
				+ "Huh? You wanna get in line? Sure you're number... uhh...\n" + "Number " + spot + "! Yeah.");
		for (int i = spot + 1; i < 101; i++)
			System.out.println("Calling number " + i + "...");
		for (int i = 1; i < spot + 1; i++)
			System.out.println("Calling number " + i + "...");
		System.out.println("Acquaintance, no papers? Get out of here you miserable worm!!!!");
	}
}
