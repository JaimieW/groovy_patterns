package composite

abstract class MenuComponent {

	void add(menuComp) { throw new UnsupportedOperationException() }
	void remove(menuComp) { throw new UnsupportedOperationException() }
	def getChild(index) { throw new UnsupportedOperationException() }
	def getName() { throw new UnsupportedOperationException() }
	def getDescription() { throw new UnsupportedOperationException() }
	def getPrice() { throw new UnsupportedOperationException() }
	def isVegetarian() { throw new UnsupportedOperationException() }
	void print() { throw new UnsupportedOperationException() }
	def createIterator() {throw new UnsupportedOperationException() }
}
