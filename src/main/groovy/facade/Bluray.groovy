package facade

class Bluray {
	def description;
	def currentTrack;
	def amplifier;
	def movie;


	public void on() {
		println(description + " on");
	}

	public void off() {
		println(description + " off");
	}

	public void eject() {
		movie = null;
		println(description + " eject");
	}

	public void play(String movie) {
		this.movie = movie;
		currentTrack = 0;
		println(description + " playing \"" + movie + "\"");
	}

	public void play(int track) {
		if (movie == null) {
			println(description + " can't play track " + track + " no bluray inserted");
		} else {
			currentTrack = track;
			println(description + " playing track " + currentTrack + " of \"" + movie + "\"");
		}
	}

	public void stop() {
		currentTrack = 0;
		println(description + " stopped \"" + movie + "\"");
	}

	public void pause() {
		println(description + " paused \"" + movie + "\"");
	}

	public void setTwoChannelAudio() {
		println(description + " set two channel audio");
	}

	public void setSurroundAudio() {
		println(description + " set surround audio");
	}

	public String toString() {
		return description;
	}
}
