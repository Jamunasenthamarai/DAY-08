interface mediaplayer{
	void play();
}
class audioplayer implements mediaplayer{
	public void play() {
		System.out.println("Playing audio");
	}
}
class MediaPlayer {
	public static void main(String []args) {
		mediaplayer m=new audioplayer();
		m.play();
	}
}
