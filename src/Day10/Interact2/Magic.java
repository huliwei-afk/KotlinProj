package Day10.Interact2;

public class Magic {
    public static void main(String[] args) {
        Spell magicSpell = new Spell();
        for(String spell : magicSpell.spells){
            System.out.println(spell);
        }

        //伴生对象
        System.out.println(Spell.MAX_SPELL_COUNT);
        //类似静态调用
        Spell.getSpellbookGreeting();
    }
}
