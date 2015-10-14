package command

class Stereo {
	def room
	Stereo(room) {this.room = room}
	void on() {println "stereo is on"}
	void off() {println "stereo is off"}
	void setCd() {println "stereo is in CD mode"}
	void setDvd() {println "stereo is in DVD mode"}
	void setVolume(volume) {println "stereo volume set to $volume"}
}
