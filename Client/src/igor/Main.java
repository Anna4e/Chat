package igor;

public class Main {

	public static void main(String[] args) {

		Chat chat = new Chat();
		chat.sayHello();
		if (chat.setUser()) {
			while (true) {
				chat.setIsRunning(true);
				Thread th = new Thread(chat);
				th.start();
				while (chat.getIsRunning())
					chat.setIsRunning(chat.enterMessage());
			}

		}
	}

}
