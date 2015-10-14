package command

class CeilingFanMediumCommand extends CeilingFanCommand {

	public CeilingFanMediumCommand(fan) {
		this.ceilingFan = fan
	}

	@Override
	public void execute() {
		prevSpeed = ceilingFan.getSpeed()
		ceilingFan.medium()
	}

}
