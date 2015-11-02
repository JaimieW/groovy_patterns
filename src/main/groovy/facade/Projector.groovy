package facade

class Projector {
	def description;
	def dvdPlayer;


	public void on() {
		println(description + " on");
	}

	public void off() {
		println(description + " off");
	}

	public void wideScreenMode() {
		println(description + " in widescreen mode (16x9 aspect ratio)");
	}

	public void tvMode() {
		println(description + " in tv mode (4x3 aspect ratio)");
	}

	public String toString() {
		return description;
	}
}
