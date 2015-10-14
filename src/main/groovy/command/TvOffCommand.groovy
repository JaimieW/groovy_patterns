package command

class TvOffCommand implements Command {

	def tv
	
	@Override
	public void execute() {
		tv.off()
	}

	@Override
	public void undo() {
		tv.on()
	}

}
