package iterator

class DinerMenu {

	static final int MAX_ITEMS = 6
	int numberOfItems = 0
	def menuItems
	
	DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS] // would normally use a collection but leaving for purpose of exercise
		
		addItem("Veggie BLT", "Fake bacon, Lettuce, tomato on wheat", true, 2.99)
		addItem("BLT", "Bacon, Lettuce, tomato on wheat", false, 2.99)
		addItem("Soup", "Soup of the day", false, 3.29)
		addItem("Hotdog", "hot dog, sauerkraut, relish, onions, cheese", false, 3.05)
	}
	
	void addItem(name, desc, isVeg, cost) {
		if(numberOfItems >= MAX_ITEMS) {
			println "ERROR cannot add more items to menu"
		}
		else {
			menuItems[numberOfItems] = new MenuItem(name: name, description: desc, vegetarian: isVeg, price: cost)
			numberOfItems++
		}
	}
	
	def createIterator() {
		return new DinerMenuIterator(menuItems)
	}
}
