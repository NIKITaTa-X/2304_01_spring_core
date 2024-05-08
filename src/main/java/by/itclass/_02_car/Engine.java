package by.itclass._02_car;

public class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
