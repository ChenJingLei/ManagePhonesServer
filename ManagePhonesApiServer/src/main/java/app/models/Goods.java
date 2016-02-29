package app.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by cjl20 on 2016/2/28.
 */
@Entity
@Table(name = "good")
public class Goods {

    @Id
    @GenericGenerator(name = "idGenerator", strategy = "uuid") //这个是hibernate的注解/生成32位UUID
    @GeneratedValue(generator = "idGenerator")
    private String gid;

    private String name;

    public Goods() {
    }

    public Goods(String name) {
        this.name = name;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "gid='" + gid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
