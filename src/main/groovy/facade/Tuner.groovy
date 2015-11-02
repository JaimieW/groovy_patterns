package facade

class Tuner {
	def description;
	def amplifier;
	def frequency;
	
 
	public void on() {
		println(description + " on");
	}
 
	public void off() {
		println(description + " off");
	}
 
	public void setFrequency(double frequency) {
		println(description + " setting frequency to " + frequency);
		this.frequency = frequency;
	}
 
	public void setAm() {
		println(description + " setting AM mode");
	}
 
	public void setFm() {
		println(description + " setting FM mode");
	}
  
		public String toString() {
				return description;
		}
}
