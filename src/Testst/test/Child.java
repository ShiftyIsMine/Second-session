package Testst.test;

import Testst.Parent;

public class Child extends Parent {
    public void testPro(){
        id = "protectedID";
        printProtected();

    }
}
