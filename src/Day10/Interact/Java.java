package Day10.Interact;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

public class Java {

    public int hitpoints = 344243;

    public static void main(String[] args) {
        Mykt.sayHello();
    }

    @NotNull
    public String utterGreeting(){
        return "Hello";
    }

    @Nullable
    public String determineFriendshipLevel(){
        return null;
    }
}
