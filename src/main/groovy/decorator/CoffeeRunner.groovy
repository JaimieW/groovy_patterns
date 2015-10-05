package decorator

drink = new Espresso()
println drink.description + ' $' + drink.cost()

drink = new DarkRoast()
drink = new Mocha(drink)
drink = new Mocha(drink)
drink = new Whip(drink)
println drink.description + ' $' + drink.cost()

drink = new HouseBlend()
drink = new Soy(drink)
drink = new Mocha(drink)
drink = new Whip(drink)
println drink.description + ' $' + drink.cost()
