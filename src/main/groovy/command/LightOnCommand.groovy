package command

class LightOnCommand implements Command {

	def light
	
	LightOnCommand(light){ this.light = light }
	
	@Override void execute() {light.on()}
	@Override void undo() {light.off()}

}
