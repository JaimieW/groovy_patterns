package command

class HotTubOnCommand implements Command {

	Hottub hottub

	@Override
	public void execute() {
		hottub.on()
		hottub.setTemp(45)
		hottub.circulate()
		hottub.jetsOn()
	}

	@Override
	public void undo() { // TODO implement state changes
		hottub.off()
	}

}
