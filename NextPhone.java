public class NextPhone extends Phone{
    public NextPhone(String modelName, Object id, Number ram, int core, int bc, String color) {
        super(modelName, id, ram, core, bc, color);
    }


    @Override
    public String toString() {
        return
                "Фирма - " + modelName  +
                ", ID - " + id +
                ", RAM - " + ram +
                ", CORE - " + core +
                ", Батарея - " + bc +
                ", Цвет - " + color;
    }
}
