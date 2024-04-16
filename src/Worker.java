
public class Worker {
   /* Оно должно вроде работать сразу как только загружается класс? Я понимаю, что его как-то в мейне надо вызвать, но не знаю как это сделать, не создавая объекта
    static {
        System.out.println(Worker.class.getClassLoader());
    }
    */
    private int id;
    private  int age;
    private String name;

    public void setId(int id) {
        if (id<0) {
            throw new IllegalArgumentException("Id can't be less than zero"); //Я знаю, что это не совсем юзерфрендли
        } else {
            this.id = id;
        }
    }

    public void setAge(int age) {
        if (age<=18 || age >=60) {
            throw new IllegalArgumentException("The age can be only between 18-60");
        } else {
            this.age = age;
        }
    }

    public void setName(String name) {
        if (name.matches("[a-zA-Z]+")) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("You must use only Latin characters");
        }

    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
