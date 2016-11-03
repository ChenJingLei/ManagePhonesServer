package app.models;

import javax.persistence.*;

/**
 * Created by cjl20 on 2016/6/19.
 */
@Table(name = "test")
@Entity
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tid",columnDefinition = "Integer",length = 50)
    private Integer id;

    @Column(name = "tname",columnDefinition = "VARCHAR(50)",length = 50)
    private String name;

    @Column(name = "tgender",columnDefinition = "VARCHAR(50)",length = 50)
    private String gender;

    @Column(name = "tother",columnDefinition = "VARCHAR(50)",length = 50)
    private String other;

    public Test() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", other='" + other + '\'' +
                '}';
    }
}
