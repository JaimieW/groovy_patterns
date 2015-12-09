package iterator

class PancakeHouseIterator implements Iterator {

	def items
	int position = 0
	
	PancakeHouseIterator(items) {
		this.items = items
	}
	
	def next() {
		return items.get(position++)
	}
	
	boolean hasNext() {
		if(position >= items.size() || items.get(position) == null)
			return false
		else
			return true
	}
}
