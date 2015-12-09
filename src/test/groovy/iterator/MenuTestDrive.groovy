package iterator

pancakeMenu = new PancakeHouseMenu()
dinerMenu = new DinerMenu()

waitress = new Waitress(pancakeHouseMenu: pancakeMenu, dinerMenu: dinerMenu)

waitress.printMenu()
