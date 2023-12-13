package DaemonThreads;

public class EclipseApp {
	public static void main(String[] args) {
		Typing type = new Typing();
		Saving save = new Saving();
		Compilation comp = new Compilation();
		save.setDaemon(true);
		comp.setDaemon(true);
		type.start();
		save.start();
		comp.start();
	}
}
