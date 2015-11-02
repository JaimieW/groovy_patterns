package facade

class Lights {
	def description;


	public void on() {
		println(description + " on");
	}

	public void off() {
		println(description + " off");
	}

	public void dim(int level) {
		println(description + " dimming to " + level  + "%");
	}

	public String toString() {
		return description;
	}
}
