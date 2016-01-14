package composite

def pancakeMenu = new Menu(name: "PANCAKE", description: "Breakfast")
def dinerMenu = new Menu(name: "DINER", description: "Lunch")
def cafeMenu = new Menu(name: "CAFE", description: "Dinner")
def dessertMenu = new Menu(name: "DESSERT",description: "Dessert")

def allMenus = new Menu(name: "ALL", description:"All combined")
allMenus.add(pancakeMenu)
allMenus.add(dinerMenu)
allMenus.add(cafeMenu)

dinerMenu.add(new MenuItem(name: "Pasta", description: "spaghetti, marinara, sour dough", vegetarian:true, price:3.89))
dinerMenu.add(dessertMenu)

dessertMenu.add(new MenuItem(name: "Apple Pie", description:"apple pie and cream", vegetarian:true, price:01.59))

def waitress  = new Waitress(allMenus: allMenus)

waitress.printMenu()


waitress.printVegetarianMenu()