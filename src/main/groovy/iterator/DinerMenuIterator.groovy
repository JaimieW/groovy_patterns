package iterator

class DinerMenuIterator implements java.util.Iterator {

	MenuItem[] items // would use a collection, but leaving here as part of exercise
	int position = 0
	
	DinerMenuIterator(items) {
		this.items = items
	}
	
	def next() {
		return items[position++]
	}
	
	boolean hasNext() {
		if(position >= items.length || items[position] == null)
			return false
		else
			return true 
	}
	
}
