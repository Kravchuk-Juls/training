package com.codespace.workB210P1.task4;

public class MyTestClass {
    private int testVar = 1;

    static class MyStaticNested {
        private int stat = 2;

        public void statTest() {
            MyTestClass testClass = new MyTestClass();
            testClass.testVar = 0;

            MyInner innerClass = new MyTestClass().new MyInner();
            MyInner innerClass2 = testClass.new MyInner();
            innerClass2.inner = 0;
        }
    }

    class MyInner {
        private int inner = 3;

        public void innerTest() {
            testVar = 10;
            MyStaticNested testClass2 = new MyStaticNested();
            testClass2.stat = 15;
        }
    }

    public void methodLocal() {
        int localVariable = 0;
        class MyLocal {
            private int local = 4;

            public void localTest() {
                testVar = -20;
                MyInner innerClass3 = new MyTestClass().new MyInner();
                innerClass3.inner = -30;

                MyInner innerClass4 = new MyInner();
                innerClass4.inner = 30;

                System.out.println(localVariable);

            }
        }
//        localVariable++;
    }

}
