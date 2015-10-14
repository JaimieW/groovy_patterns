package command

class CeilingFanOnCommand implements Command {

	def fan
	
	
	CeilingFanOnCommand(fan) { this.fan = fan }

	@Override
	public void execute() {
		fan.high()
	}

	@Override void undo() {}
}
