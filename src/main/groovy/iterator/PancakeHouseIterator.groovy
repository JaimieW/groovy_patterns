package iterator

class PancakeHouseIterator implements Iterator {

	ArrayList items
	int position = 0
	
	PancakeHouseIterator(items) {
		this.items = items
	}
	
	Object next() {
		def menuItem = items.get(position)
		position++
		return menuItem
	}
	
	boolean hasNext() {
		if(position >= items.size() || items.get(position) == null)
			return false
		else
			return true
	}
}
