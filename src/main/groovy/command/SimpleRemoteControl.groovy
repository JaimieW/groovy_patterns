package command

class SimpleRemoteControl {

	def slot
	
	void setCommand(command){this.slot = command}
	void buttonWasPressed(){
		slot.execute()
	}
}
