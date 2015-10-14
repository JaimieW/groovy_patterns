package command

class StereoOnWithCDCommand implements Command {
	
	def stereo
	
	StereoOnWithCDCommand(stereo) {
		this.stereo = stereo
	}
	
	@Override
	public void execute() {
		stereo.on()
		stereo.setCd()
		stereo.setVolume(11)
	}

}
