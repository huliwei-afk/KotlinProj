package Day10.Interact2

class Spell {
    @JvmField
    var spells = listOf("magic ho", "magic bo")

    companion object{
        @JvmField
        var MAX_SPELL_COUNT = 10
        @JvmStatic
        fun getSpellbookGreeting() = println("I am the greatest")
    }
}