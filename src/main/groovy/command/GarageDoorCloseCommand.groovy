package command

class GarageDoorCloseCommand implements Command {

	def door
	
	GarageDoorCloseCommand(door){ this.door = door }
	
	@Override
	public void execute() {
		door.close()
	}

	@Override
	public void undo() {
		door.open()
	}

}
