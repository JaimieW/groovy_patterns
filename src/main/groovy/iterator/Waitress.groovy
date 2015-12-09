package iterator

class Waitress {

	def pancakeHouseMenu
	def dinerMenu
	
	void printMenu() {
		def pancakeIterator = pancakeHouseMenu.createIterator()
		def dinerIterator = dinerMenu.createIterator()
		
		println "MENU\n----------------------\nBREAKFAST"
		printMenuItems(pancakeIterator)
		
		println "\nLUNCH"
		printMenuItems(dinerIterator)
	}
	
	private void printMenuItems(Iterator iter) {
		while(iter.hasNext()) {
			def menuItem = iter.next()
			println "${menuItem.name}, ${menuItem.price} -- ${menuItem.description}"
		}
	}
}
