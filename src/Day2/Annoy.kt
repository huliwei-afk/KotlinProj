package Day2

fun main() {
    var total = "Mississipi".count()

    var totalS = "Mississipi".count { letter ->
        letter == 's'
    }

//    println(total)
//    println(totalS)

//    val blessingFunc:() -> String = {
//        val holiday = "New Year."
//        "Happy $holiday"
//    }
//
//    println(blessingFunc)
//    println(blessingFunc())


//    val blessingFunc:(String) -> String = {name ->
//        val holiday = "New Year."
//        "$name, Happy $holiday"
//    }


//    val blessingFunc:(String) -> String = {it
//        val holiday = "New Year."
//        "$it, Happy $holiday"
//    }

//    val blessingFunc = {
//        val holiday = "New Year."
//        "Happy $holiday"
//    }

//    val blessingFunc:(String, Int) -> String = {name, year ->
//        val holiday = "New Year."
//        "$name Happy $holiday $year"
//    }

    val blessingFunc = {name:String, year:Int ->
        val holiday = "New Year."
        "$name Happy $holiday $year"
    }

    println(blessingFunc("jack",2022))
}

