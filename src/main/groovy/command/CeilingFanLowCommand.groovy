package command

class CeilingFanLowCommand extends CeilingFanCommand {

	public CeilingFanLowCommand(fan) {
		this.ceilingFan = fan
	}

	@Override
	public void execute() {
		prevSpeed = ceilingFan.getSpeed()
		ceilingFan.low()
	}

}
