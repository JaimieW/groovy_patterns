package command

class RemoteControl {
	def onCommands = []
	def offCommands = []
	
	void setCommand(slot, onCommand, offCommand) {
		onCommands.putAt(slot, onCommand)
		offCommands.putAt(slot, offCommand)
	}
	
	void onButtonPushed(slot) {
		onCommands.getAt(slot).execute()
	}
	
	void offButtonWasPushed(slot) {
		offCommands.getAt(slot).execute()
	}
	
	String toString() {
		def data = "\n------ Remote Control ------\n"
		for(def i=0;i<onCommands.size(); i++) {
			data += "[slot $i ] ${onCommands.getAt(i).getClass().getName()} ${offCommands.getAt(i).getClass().getName()} \n"
		}
		return data
	}
}
