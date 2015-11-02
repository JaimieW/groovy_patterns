package facade

// TODO replace with groovy strings
class PopcornMachine {
	def description;

	public void on() {
		println(description + " on");
	}

	public void off() {
		println(description + " off");
	}

	public void pop() {
		println(description + " popping popcorn!");
	}


	public String toString() {
		return description;
	}
}
