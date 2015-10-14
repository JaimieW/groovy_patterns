package command

class CeilingFanOffCommand implements Command {
	def fan
	CeilingFanOffCommand(fan) {this.fan = fan	}

	@Override
	public void execute() {
		fan.off()
	}

}
