public class Pet {
    private String name;
    private String type;
    private int age;

    public Pet() {
        this.name = "";
        this.type = "";
        this.age = 0;
    }

    public Pet(String name, String type, int age) {
        setName(name);
        setType(type);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String speak() {
        if (type.equalsIgnoreCase("dog")) {
            return "Woof";
        } else if (type.equalsIgnoreCase("cat")) {
            return "Meow";
        } else {
            return "Noise";
        }
    }

    @Override
    public String toString() {
        String result = "Pet information:\n";
        result += "Type: " + getType() + "\n";
        result += "Name: " + getName() + "\n";
        result += "Sound: " + speak() + "\n";
        result += "Age: " + getAge() + "\n";
        return result;
    }
}
