package composite

class Waitress {
	def allMenus
	
	void printMenu() {
		allMenus.print()
	}
	
	void printVegetarianMenu() {
		def iterator = allMenus.createIterator()
		println "\nVEGETARIAN MENU\n------"
		while(iterator.hasNext()) {
			def menuComponent = iterator.next()
			try {
				if(menuComponent.isVegetarian())
					menuComponent.print()
			} catch(UnsupportedOperationException e) { /* no op */ }
		}
	}
}
