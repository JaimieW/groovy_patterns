package command

class GarageDoorCloseCommand implements Command {

	def door
	
	GarageDoorCloseCommand(door){ this.door = door }
	
	@Override
	public void execute() {
		door.close()
	}

}
