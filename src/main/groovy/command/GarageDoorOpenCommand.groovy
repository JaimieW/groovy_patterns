package command

class GarageDoorOpenCommand implements Command {

	def door
	
	GarageDoorOpenCommand(door){ this.door = door }
	
	@Override
	public void execute() {
		door.open()
	}

	@Override
	public void undo() {
		door.close()
	}
	
	

}
