package app.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by cjl20 on 2016/5/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "phone")
@Entity
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pno", columnDefinition = "INT")
    private Integer id;

    @Column(name = "pimei", columnDefinition = "VARCHAR(50)", length = 50)
    private String imei;

    @Column(name = "pname", columnDefinition = "VARCHAR(50)", length = 50)
    private String name;

    @Column(name = "ptype", columnDefinition = "VARCHAR(50)", length = 50)
    private String type;

    @Column(name = "pcolor", columnDefinition = "VARCHAR(10)", length = 10)
    private String color;

    @Column(name = "pprice", columnDefinition = "decimal", length = 10, precision = 2)
    private double price;

    public Phone() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", imei='" + imei + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
