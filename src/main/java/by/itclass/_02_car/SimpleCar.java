package by.itclass._02_car;


public class SimpleCar {
    protected int id;
    protected String model;

    public SimpleCar() {
        model = "default model";
    }

    public SimpleCar(String model) {
        this.model = model;
    }

    public SimpleCar(int id, String model) {
        this.id = id;
        this.model = model;
    }

    public SimpleCar(String model, int id) {
        this.id = id;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "SimpleCar{" +
                "id=" + id +
                ", model='" + model + '\'' +
                '}';
    }
}
