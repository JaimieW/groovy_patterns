package command

light = new Light("living room")
tv = new TV(room: "living room")
stereo = new Stereo("living room")
hottub = new Hottub()

lightOn = new LightOnCommand(light)
lightOff = new LightOffCommand(light)
stereoOn = new StereoOnWithCDCommand(stereo)
stereoOff = new StereoOffCommand(stereo)
tvOn = new TvOnCommand(tv: tv)
tvOff = new TvOffCommand(tv: tv)
hottubOn = new HotTubOnCommand(hottub: hottub)
hottubOff = new HottubOffCommand(hottub: hottub)

partyOn = [lightOn, stereoOn, tvOn, hottubOn]
partyOff = [lightOff, stereoOff, tvOff, hottubOff]

macroOn = new MacroCommand(partyOn)
macroOff = new MacroCommand(partyOff)

remote = new RemoteControlWithUndo()
remote.setCommand(0, macroOn, macroOff)

println remote
println "--- pushing macro on button ---"
remote.onButtonPushed(0)
println "--- pushing macro off button ---"
remote.offButtonWasPushed(0)