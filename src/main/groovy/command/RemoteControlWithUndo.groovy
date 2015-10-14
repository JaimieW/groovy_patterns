package command

class RemoteControlWithUndo {

	def onCommands = []
	def offCommands = []
	def undoCommand
	
	void setCommand(slot, onCommand, offCommand) {
		onCommands.putAt(slot, onCommand)
		offCommands.putAt(slot, offCommand)
	}
	
	void onButtonPushed(slot) {
		onCommands.getAt(slot).execute()
		undoCommand = onCommands.getAt(slot)
	}
	
	void offButtonWasPushed(slot) {
		offCommands.getAt(slot).execute()
		undoCommand = offCommands.getAt(slot)
	}
	
	void undoButtonWasPushed() {
		undoCommand.undo()
	}
	
	String toString() {
		def data = "\n------ Remote Control ------\n"
		for(def i=0;i<onCommands.size(); i++) {
			data += "[slot $i ] ${onCommands.getAt(i).getClass().getName()} ${offCommands.getAt(i).getClass().getName()} \n"
		}
		data += "[undo] ${undoCommand.getClass().getName()}\n"
		return data
	}
}


