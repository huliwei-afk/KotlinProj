package Day8.outAndIn;

import java.util.ArrayList;
import java.util.List;

public class GenericTypeTest {
    public static void main(String[] args) {
        List<? extends CharSequence> charSequences = new ArrayList<String>();
        //charSequences = new ArrayList<Object>(); 不可以

        //List<? super CharSequence> CharSequences = new ArrayList<String>(); 不可以
        List<? super CharSequence> CharSequences = new ArrayList<Object>();
    }
}
