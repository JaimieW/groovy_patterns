package facade

class Amp {

	def description
	def tuner
	def bluray
	def mp3Player
	
	void on() { println "$description on" }
	void off() {println "$description off"}
	
	public void setStereoSound() {
		println(description + " stereo mode on");
	}
 
	public void setSurroundSound() {
		println(description + " surround sound on (5 speakers, 1 subwoofer)");
	}
 
	public void setVolume(int level) {
		println(description + " setting volume to " + level);
	}

	public void setTuner(tuner) {
		println(description + " setting tuner to " + tuner);
		this.tuner = tuner;
	}
  
	public void setBluray( bluray) {
		println(description + " setting Bluray player to " + bluray);
		this.bluray = bluray;
	}
 
	public void setMp3(mp3) {
		println(description + " setting CD player to " + mp3);
		this.mp3 = mp3;
	}
 
	public String toString() {
		return description;
	}
}
