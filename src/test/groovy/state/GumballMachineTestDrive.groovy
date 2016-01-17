package state

def machine = new GumballMachine(5)
println machine

machine.insertQuarter()
machine.turnCrank()

println machine

machine.insertQuarter()
machine.turnCrank()
machine.insertQuarter()
machine.turnCrank()

println machine
