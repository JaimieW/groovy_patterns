package command

class TV {
	def room
	def channel
	
	void on() {println "$room tv is on"}
	void off() {println "$room tv is off"}
	void setInputChannel() {
		this.channel = 3
		println "$room TV channel is set for DVD"
	}
}
