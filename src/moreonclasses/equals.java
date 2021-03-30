package moreonclasses;

public class equals {
    private int x;
    public boolean equals(Object o){
        return ((A)o).x == this.x;
    }

    public static <A> void main(String[] args) {
        A a = new A();
        a.x = 9;
        A b = new A();
        b.x = 5;
        System.out.println(a.equals(b));
    }
}
