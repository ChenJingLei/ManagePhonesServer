package app.models;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by cjl20 on 2016/2/28.
 */
@Entity
@Table(name = "in_warehouse")
public class InWarehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String imei;

    private Date intime;

    public InWarehouse() {
    }

    public InWarehouse(String imei, Date intime) {
        this.imei = imei;
        this.intime = intime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getimei() {
        return imei;
    }

    public void setimei(String imei) {
        this.imei = imei;
    }

    public Date getIntime() {
        return intime;
    }

    public void setIntime(Date intime) {
        this.intime = intime;
    }

    @Override
    public String toString() {
        return "InWarehouse{" +
                "id=" + id +
                ", imei='" + imei + '\'' +
                ", intime=" + intime +
                '}';
    }
}
