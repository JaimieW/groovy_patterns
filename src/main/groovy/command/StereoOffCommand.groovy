package command

class StereoOffCommand implements Command {

	def stereo
	StereoOffCommand(stereo) { this.stereo = stereo}

	@Override
	public void execute() {stereo.off()	}

	@Override
	public void undo() { // TODO undo should use state
		stereo.on()
	}

}
