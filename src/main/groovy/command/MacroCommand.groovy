package command

class MacroCommand implements Command {

	def commands = []
	
	MacroCommand(commands) {
		this.commands = commands
	}

	@Override
	public void execute() {
		commands.each {	it.execute() }

	}

	@Override
	public void undo() {
		commands.each { it.undo() }
	}

}
