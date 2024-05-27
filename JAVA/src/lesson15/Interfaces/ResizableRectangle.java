package lesson15.Interfaces;

public class ResizableRectangle implements Resizeable{
    int a;
    int b;

    public ResizableRectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void resize(int n) {
        a -= n;
        b -= n;
    }

    @Override
    public String toString() {
        return "Rectangle: " + a + " " + b;
    }
}
