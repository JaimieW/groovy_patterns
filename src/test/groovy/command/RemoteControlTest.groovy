package command


def remote = new SimpleRemoteControl()
def light = new Light()
def lightOn = new LightOnCommand(light)
remote.setCommand(lightOn)
remote.buttonWasPressed()

def garageDoor = new GarageDoor()
def doorOpen = new GarageDoorOpen(garageDoor)
remote.setCommand(doorOpen)
remote.buttonWasPressed()
