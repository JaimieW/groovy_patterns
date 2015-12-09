package iterator

class Waitress {

	def pancakeHouseMenu
	def dinerMenu
	
	void printMenu() {
		def pancakeIterator = pancakeHouseMenu.createIterator()
		def dinerIterator = dinerMenu.createIterator()
		
		println "MENU\n----------------------\nBREAKFAST"
		pancakeHouseMenu.menuItems.each { menuItem ->
			println "${menuItem.name}, ${menuItem.price} -- ${menuItem.description}"
		}
		
		println "\nLUNCH"
		dinerMenu.menuItems.each { //needs null check because its an array
			if(it)
				println "${it.name}, ${it.price} -- ${it.description}"
		}
	}
}
