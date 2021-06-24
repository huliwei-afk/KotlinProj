package Day8.Generic
//out
interface Production<out T>{
    fun product() : T
}

//in
interface Consumer<in T>{
    fun consume(item : T)
}

//invariant
interface ProductionConsumer<T>{
    fun product() : T
    fun consume(item : T)
}

open class Food
open class FastFood : Food()
class Burger : FastFood()

//生产者
class FoodStore : Production<Food>{
    override fun product(): Food {
        println("Produce food")
        return Food()
    }
}

class FastFoodStore : Production<FastFood>{
    override fun product(): FastFood {
        println("Produce food")
        return FastFood()
    }
}

class BurgerStore : Production<Burger>{
    override fun product(): Burger {
        println("Produce food")
        return Burger()
    }
}

class Everybody() : Consumer<Food>{
    override fun consume(item: Food) {
        println("Eat food")
    }
}

class ModernPeople : Consumer<FastFood>{
    override fun consume(item: FastFood) {
        println("Eat fastFood")
    }
}

class America : Consumer<Burger>{
    override fun consume(item: Burger) {
        println("Eat burger")
    }

}

fun main() {
    var production1 : Production<Food> = FoodStore()
    //out使得下面不报错
    var production2 : Production<Food> = FastFoodStore()
    var production3 : Production<Food> = BurgerStore()

    var consumer3 : Consumer<Burger> = America()
    //in使得下面不报错
    var consumer1 : Consumer<Burger> = Everybody()
    var consumer2 : Consumer<Burger> = ModernPeople()

}