package app.models;

/**
 * Created by cjl20 on 2016/6/19.
 */
public class Student<T> {

    private T id;
    private String name;

    public Student() {
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
