package adapter

mallard = new Mallard()
wildTurkey = new WildTurkey()
turkeyAdapter = new TurkeyAdapter(turkey: wildTurkey)

println "the turkey says ..."
wildTurkey.gobble()
wildTurkey.fly()

println "The duck says..."
testDuck(mallard)

println "the TurkeyAdapter says..."
testDuck(turkeyAdapter)

void testDuck(Duck duck) {
	duck.quack()
	duck.fly()
}

