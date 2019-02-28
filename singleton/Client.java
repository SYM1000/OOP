package singleton;

public class Client {
	public static void main(String[] args) {
		Preferences pref = null;
		//pref = new Preferences();
		pref = Preferences.getInstance();
		pref.setShareInfo(true);
		System.out.println(pref.toString());
		//...
		pref = new Preferences.getInstance();
		System.out.println(pref.toString());
	}
}
