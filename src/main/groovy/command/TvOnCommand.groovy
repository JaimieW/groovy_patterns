package command

class TvOnCommand implements Command {

	TV tv
	
	@Override
	public void execute() {
		tv.on()
		tv.setInputChannel()
	}

	@Override
	public void undo() {
		tv.off()
	}

}
