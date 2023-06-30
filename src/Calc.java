public enum Calc {
    sum{

        public double action(double a, double b) {
            return a + b;
        }
    },
    subtract{
        public double action(double a, double b) {
            return a - b;
        }
    },
    multiply{
        public double action(double a, double b) {
            return a * b;
        }
    },
    divide{
        public double action(double a, double b) {
            return a / b;
        }
    },
    pow{
        public double action(double a, double b) {
            return Math.pow(a, b);
        }
    };
    public abstract double action(double a, double b);
}
