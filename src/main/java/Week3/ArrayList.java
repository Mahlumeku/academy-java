package Week3;

public class ArrayList {
	public static void main(String[] args) {
		ArrayList names = new ArrayList();

		names.add("David");
		names.add("Alice");
		names.add("Bob");
		names.add("Samir");
		names.add("David");

		int lastDavid = names.lastIndexOf("David");

		System.out.println("Last David at " + lastDavid);
	}

	private int lastIndexOf(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

	private void add(String string) {
		// TODO Auto-generated method stub

	}
}
