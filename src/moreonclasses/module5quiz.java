package moreonclasses;

public class module5quiz {
    class A {
        private void print() {
            System.out.println("a");
        }
        private void print(String str) {
            System.out.println("b");
        }
        private void print(int x) {
            System.out.println("c");
        }
        public void main(String[] args) {
            A object = new A();
            object.print(12);
        }
    }
}