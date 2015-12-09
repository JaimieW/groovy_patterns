package iterator

class DinerMenuIterator implements Iterator {

	MenuItem[] items
	int position = 0
	
	DinerMenuIterator(items) {
		this.items = items
	}
	
	Object next() {
		def menuItem = items[position]
		position++
		return menuItem // could be replaced by return items[position++] ????
	}
	
	boolean hasNext() {
		if(position >= items.length || items[position] == null)
			return false
		else
			return true 
	}
	
}
