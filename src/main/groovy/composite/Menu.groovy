package composite

class Menu extends MenuComponent {

	List menuComponents = []
	def name
	def description
	def iterator
	
	@Override void add(menuComponent) {
		menuComponents.add(menuComponent)
	}
	@Override void remove(menuComponent) {
		menuComponents.remove(menuComponent)
	}
	@Override def getChild(index) {
		return menuComponents.getAt(index)
	}
	@Override def getDescription() {
		return description
	}
	@Override void print() {
		println "\n$name, $description\n-------------------------------"
		menuComponents.each {
			it.print()
		}
	}
	
	@Override 
	def createIterator() {
		return iterator?:new CompositeIterator(menuComponents.iterator())
	}
}
