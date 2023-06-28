public enum Calc {
    sum{

        public void action(int a, int b) {
            int c = a + b;
            System.out.println(c);
        }
    },
    subtract{
        public void action(int a, int b) {
            int c = a - b;
            System.out.println(c);
        }
    },
    multiply{
        public void action(int a, int b) {
            int c = a * b;
            System.out.println(c);
        }
    },
    divide{
        public void action(int a, int b) {
            double c = (double) a / b;
            System.out.println(c);
        }
    },
    pow{
        public void action(int a, int b) {
            int c = (int) Math.pow(a, b);
            System.out.println(c);
        }
    };
    public abstract void action(int a, int b);
}
