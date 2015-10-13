package command

class LightOnCommand implements Command {

	def light
	
	LightOnCommand(light){
		this.light = light
	}
	
	@Override
	public void execute() {
		light.on()
	}

}
