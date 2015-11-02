package facade

class HomeCinema {

	def amp
	def tuner
	def bluray
	def cd
	def projector
	def lights
	def screen
	def popcornMachine
	
	void watchMovie(movie) {
		println "get ready to watch a movie ..."
		popcornMachine.on()
		popcornMachine.pop()
		lights.dim(10)
		screen.down()
		projector.on()
		projector.wideScreenMode()
		amp.on()
		amp.setBluray(bluray)
		amp.setSurroundSound()
		bluray.on()
		bluray.play(movie)
	}
	
	void endMovie() {
		println "shutting down home cinema..."
		popcornMachine.off()
		lights.on()
		screen.up()
		projector.off()
		amp.off()
		bluray.stop()
		bluray.eject()
		bluray.off()
	}
	
}
