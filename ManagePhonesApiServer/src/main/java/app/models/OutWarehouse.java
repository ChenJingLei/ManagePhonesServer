package app.models;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by cjl20 on 2016/2/28.
 */
@Entity
@Table(name = "out_warehouse")
public class OutWarehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String gid;

    private String imei;

    private Date outtime;


    public OutWarehouse() {
    }

    public OutWarehouse(String gid, String imei, Date outtime) {
        this.gid = gid;
        this.imei = imei;
        this.outtime = outtime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public Date getOuttime() {
        return outtime;
    }

    public void setOuttime(Date outtime) {
        this.outtime = outtime;
    }

    @Override
    public String toString() {
        return "OutWarehouse{" +
                "id=" + id +
                ", gid='" + gid + '\'' +
                ", imei='" + imei + '\'' +
                ", outtime=" + outtime +
                '}';
    }
}
