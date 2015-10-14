package command

class HottubOffCommand implements Command {
	Hottub hottub
	@Override
	public void execute() {
		hottub.off()
	}

	@Override
	public void undo() { // TODO implement state
		hottub.on()
	}

}
