package command

class GarageDoorOpen implements Command {

	def door
	
	GarageDoorOpen(door){ this.door = door }
	
	@Override
	public void execute() {
		door.open()
	}

}
