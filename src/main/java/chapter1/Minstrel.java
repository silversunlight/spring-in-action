package chapter1;

import java.io.PrintStream;

/**
 * 吟游诗人，aop类
 */
public class Minstrel {
    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    //探险之前调用
    public void singBeforeQuest() {
        stream.println("the knight is so brave!");
    }

    //探险之后调用
    public void singAfterQuest() {
        stream.println("the brave knight did embark on a quest!");
    }
}
