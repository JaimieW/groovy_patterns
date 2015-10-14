package command

class Light {
	def room
	Light(room){this.room = room}
	void on(){ println "$room light is on"}
	void off(){ println "$room light is off"}
}
