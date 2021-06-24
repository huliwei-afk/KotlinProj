package Day10.Interact4;

import java.io.IOException;

public class Exception {
    public static void main(String[] args) {
        //可以不处理运行时异常
        new Exception().runExcep();

        //java中这个必须要处理，否则报错
        try {
            new Exception().IOExcep();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //不加上@Throws注解是捕获不到异常的
        //因为kt返回的是一个Throwable类型
        try {
            TestKt.TestExcep();
        }catch (IOException e){
            System.out.println("sd");
        }

    }

    public void runExcep() throws RuntimeException{
        throw new RuntimeException();
    }

    public void IOExcep() throws IOException{
        throw new IOException();
    }
}
