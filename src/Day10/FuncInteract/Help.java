package Day10.FuncInteract;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class Help {
    public static void main(String[] args) {
        //FunctionN代表N个参数
        Function1<String, Unit> translator = FuncTestKt.getTranslator();
        //使用invoke调用
        translator.invoke("TRUTH");
    }
}
