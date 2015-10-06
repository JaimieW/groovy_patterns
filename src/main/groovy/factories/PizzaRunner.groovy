package factories

import factories.creator.*
import factories.product.Pizza

nyStore = new NYPizzaStore()
chicagoStore = new ChicagoPizzaStore()

Pizza pizza = nyStore.orderPizza('cheese')
println pizza

println "Joe ordered a ${pizza} pizza"
println "************************************"
pizza = chicagoStore.orderPizza('cheese')
println "Pat ordered a ${pizza} pizza"
println "************************************"

pizza = nyStore.orderPizza('clam')
println "Joe ordered a ${pizza} pizza"
println "************************************"
pizza = chicagoStore.orderPizza('clam')
println "Pat ordered a ${pizza} pizza"
println "************************************"
pizza = nyStore.orderPizza('pepperoni')
println "Joe ordered a ${pizza} pizza"
println "************************************"
pizza = chicagoStore.orderPizza('pepperoni')
println "Pat ordered a ${pizza} pizza"
println "************************************"
pizza = nyStore.orderPizza('veggie')
println "Joe ordered a ${pizza} pizza"
println "************************************"
pizza = chicagoStore.orderPizza('veggie')
println "Pat ordered a ${pizza} pizza"