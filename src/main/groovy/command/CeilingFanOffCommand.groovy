package command

class CeilingFanOffCommand extends CeilingFanCommand {
	
	CeilingFanOffCommand(fan) {this.ceilingFan = fan	}

	@Override
	public void execute() {
		prevSpeed = ceilingFan.getSpeed()
		ceilingFan.off()
	}
}
