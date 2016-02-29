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
    private String gid;

    @Id
    private String imei;

    private Date intime;

    public InWarehouse() {
    }

    public InWarehouse(String gid, String imei, Date intime) {
        this.gid = gid;
        this.imei = imei;
        this.intime = intime;
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

    public Date getIntime() {
        return intime;
    }

    public void setIntime(Date intime) {
        this.intime = intime;
    }

    @Override
    public String toString() {
        return "InWarehouse{" +
                "gid='" + gid + '\'' +
                ", imei='" + imei + '\'' +
                ", intime=" + intime +
                '}';
    }
}
