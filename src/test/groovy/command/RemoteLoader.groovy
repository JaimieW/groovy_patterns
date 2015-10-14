package command


//remote = new RemoteControl()
remote = new RemoteControlWithUndo()

ceilingFan = new CeilingFan("Living Room")
ceilingFanOff = new CeilingFanOffCommand(ceilingFan)
ceilingFanHigh = new CeilingFanHighCommand(ceilingFan)
ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan)

remote.setCommand(0, ceilingFanMedium, ceilingFanOff)
remote.setCommand(1, ceilingFanHigh, ceilingFanOff)

remote.onButtonPushed(0)
remote.offButtonWasPushed(0)
println remote
remote.undoButtonWasPushed()

remote.onButtonPushed(1)
println remote
remote.undoButtonWasPushed()


//livingRoomLight = new Light("Living Room")
////kitchenLight = new Light("Kitchen")
//ceilingFan = new CeilingFan("Living Room")
////garageDoor = new GarageDoor()
////stereo = new Stereo("Living Room")
//
//livingRoomLightOn = new LightOnCommand(livingRoomLight)
//livingRoomLightOff = new LightOffCommand(livingRoomLight)
//
////kitchenLightOn = new LightOnCommand(kitchenLight)
////kitchenLightOff = new LightOffCommand(kitchenLight)
////
//ceilingFanOn = new CeilingFanOnCommand(ceilingFan)
//ceilingFanOff = new CeilingFanOffCommand(ceilingFan)
////
////garageDoorOpen = new GarageDoorOpenCommand(garageDoor)
////garageDoorClose = new GarageDoorCloseCommand(garageDoor)
////
////stereoCdOn = new StereoOnWithCDCommand(stereo)
////stereoOff = new StereoOffCommand(stereo)
//
//remote.setCommand(0, livingRoomLightOn, livingRoomLightOff)
////remote.setCommand(1, kitchenLightOn, kitchenLightOff)
//remote.setCommand(2, ceilingFanOn, ceilingFanOff)
////remote.setCommand(3, stereoCdOn, stereoOff)
//
//println remote
//
////remote.onButtonPushed(0)
////remote.offButtonWasPushed(0)
//
////remote.onButtonPushed(1)
////remote.offButtonWasPushed(1)
////
//remote.onButtonPushed(2)
//remote.offButtonWasPushed(2)
////
////remote.onButtonPushed(3)
////remote.offButtonWasPushed(3)
//
//remote.onButtonPushed(0)
//remote.offButtonWasPushed(0)
//println remote
//remote.undoButtonWasPushed()
//remote.offButtonWasPushed(0)
//remote.onButtonPushed(0)
//println remote
//remote.undoButtonWasPushed()
