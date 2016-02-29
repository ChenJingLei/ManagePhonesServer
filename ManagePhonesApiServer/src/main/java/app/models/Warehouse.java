package app.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by cjl20 on 2016/2/29.
 */
@Entity
@Table(name = "warehouse")
public class Warehouse {

    @Id
    private String imei;
    private String gid;

    public Warehouse() {
    }

    public Warehouse(String imei, String gid) {
        this.imei = imei;
        this.gid = gid;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "imei='" + imei + '\'' +
                ", gid='" + gid + '\'' +
                '}';
    }
}
