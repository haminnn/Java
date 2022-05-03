

public class RemoteControlExample {
//	private static void printSound(RemoteControl remotecontrol) {
//		System.out.println(remotecontrol.volume);
//	}

	public static void main(String[] args) {
		RemoteControl rc1 = new Television();
		rc1.setVolume(2);
		RemoteControl rc2 = new Audio();
		rc2.setMute(true);
		

	}

}
