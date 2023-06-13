public class Pet {
    String name;
    String color;
    int age;
    Person dueno;

    public Pet(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }
}
