package command

class CeilingFanHighCommand extends CeilingFanCommand {

	public CeilingFanHighCommand(fan) {
		ceilingFan = fan
	}

	@Override
	public void execute() {
		prevSpeed = ceilingFan.getSpeed()
		ceilingFan.high()
	}


}
