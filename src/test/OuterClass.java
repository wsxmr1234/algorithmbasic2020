package test;

public class OuterClass {
    private int b;

    public OuterClass(int b) {
        this.b = b;
    }

    public class InnerClass {
        public static final int i = 9;
        private int a;

        public InnerClass(int a) {
            this.a = a;
        }

        @Override
        public String toString() {
            return "InnerClass{" +
                    "a=" + a +
                    '}';
        }

        public void test() {
            System.out.println(OuterClass.this.b);
        }
    }




    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass(2);
        OuterClass.InnerClass a = outerClass.new InnerClass(1);
//        System.out.println(a);
        a.test();

    }
}
