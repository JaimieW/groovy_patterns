package facade

amp = new Amp(description: "Top-o-line Amplifier")
tuner = new Tuner(description: "DAB tuner")
bluray = new Bluray(description: "3D bluray player")
cd = new CdPlayer(description: "SACD player")
projector = new Projector(description: "4K projector")
lights = new Lights(description: "Cinema lights")
screen = new Screen(description: "Home cinema screen")
popcorn = new PopcornMachine(description: "Home Popcorn")

homeCinema = new HomeCinema(amp: amp,
							tuner: tuner,
							bluray: bluray,
							cd: cd,
							projector: projector,
							screen: screen,
							lights: lights,
							popcornMachine: popcorn)

homeCinema.watchMovie("Star Wars")

println "...."

homeCinema.endMovie()
