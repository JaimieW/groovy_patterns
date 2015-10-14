package command

class LightOffCommand implements Command{
	def light
	
	LightOffCommand(light) {
		this.light = light
	}
	
	@Override
	public void execute() {
		light.off()
	}

}
