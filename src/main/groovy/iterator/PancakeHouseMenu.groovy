package iterator

class PancakeHouseMenu {

	ArrayList menuItems

	PancakeHouseMenu() {
		this.menuItems = new ArrayList()
        addItem("KB Breakfast Pancake", "pancake, scrambled egg, toast", true, 2.99 )
		addItem("Breakfast Pancake", "pancake, fried egg, sausage", false, 2.99 )
		addItem("Blueberry Pancake", "pancake, fresh blue berries", true, 3.49 )
		addItem("Waffles", "waffles, blue berries or strawberries", true, 3.49 )
	}
	
	void addItem(name, desc, isVeg, cost) {
		menuItems.add(new MenuItem(name: name, description: desc, vegetarian: isVeg, price: cost))
	}
	
	Iterator createIterator() {
		return new PancakeHouseIterator(menuItems)
	}
	
	
}
