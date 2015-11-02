package facade

class CdPlayer {
	def description;
	def currentTrack;
	def amplifier;
	def title;



	public void on() {
		println(description + " on");
	}

	public void off() {
		println(description + " off");
	}

	public void eject() {
		title = null;
		println(description + " eject");
	}

	public void play(String title) {
		this.title = title;
		currentTrack = 0;
		println(description + " playing \"" + title + "\"");
	}

	public void play(int track) {
		if (title == null) {
			println(description + " can't play track " + currentTrack +
					", no cd inserted");
		} else {
			currentTrack = track;
			println(description + " playing track " + currentTrack);
		}
	}

	public void stop() {
		currentTrack = 0;
		println(description + " stopped");
	}

	public void pause() {
		println(description + " paused \"" + title + "\"");
	}

	public String toString() {
		return description;
	}
}
