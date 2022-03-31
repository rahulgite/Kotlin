
public class JavaClassForKotlin {
    private String name; //with setter and getter
    private Integer age; // only with getter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public JavaClassForKotlin(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "JavaClassForKotlin{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
