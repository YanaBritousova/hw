package Task2;

public class Computer {
    static class Processor{
        private String model = "Intel i5";
        public String getDetails(){
            return model;
        }
    }
    class RAM{
        private String size;

        public RAM(String size) {
            this.size = size;
        }

        public String getDetails(){
            return size;
        }
    }
}
