package facade

class Screen {
	def description;

	public void up() {
		println(description + " going up");
	}

	public void down() {
		println(description + " going down");
	}


	public String toString() {
		return description;
	}
}
