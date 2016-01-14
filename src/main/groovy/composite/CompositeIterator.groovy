package composite

import java.util.Iterator

class CompositeIterator implements Iterator {
	def stack = new Stack()
	
	
	
	public CompositeIterator(iterator) {
		stack.push(iterator)
	}

	@Override
	public boolean hasNext() {

		if(stack.empty()) {
			return false;
		} else {
			def iterator = stack.peek()
			if(!iterator.hasNext()) {
				stack.pop()
				return hasNext()
			} else {
				return true
			}
		}
	}

	@Override
	public Object next() {
		if(hasNext()) {
			def iterator = stack.peek()
			def component = iterator.next()
			if(component instanceof Menu) {
				stack.push(component.createIterator())
			}
			return component
		} else {
			return null
		}
	}

}
