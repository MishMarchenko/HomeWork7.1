public class ClassA {
    public static class Computers{
        private String os;
        private int ssd;

        @Override
        public String toString() {
            return "Computers " +
                    "os = '" + os + '\'' +
                    ", ssd = " + ssd;
        }

        public Computers(String model, int ssd){
            this.os = model;
            this.ssd = ssd;

        }
    }
}
