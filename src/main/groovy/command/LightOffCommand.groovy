package command

class LightOffCommand implements Command{
	def light
	
	LightOffCommand(light) {
		this.light = light
	}
	
	@Override
	void execute() {
		light.off()
	}
	@Override
	void undo() {
		light.on()
	}

}
