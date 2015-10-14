package command

abstract class CeilingFanCommand implements Command {

	CeilingFan ceilingFan
	def prevSpeed

	abstract void execute()

	@Override
	public void undo() {
		if(prevSpeed == CeilingFan.Speed.HIGH) {
			ceilingFan.high()
		} else if(prevSpeed == CeilingFan.Speed.MEDIUM) {
			ceilingFan.medium()
		} else if(prevSpeed == CeilingFan.Speed.LOW) {
			ceilingFan.low()
		} else if(prevSpeed == CeilingFan.Speed.OFF) {
			ceilingFan.off()
		}
	}
}
