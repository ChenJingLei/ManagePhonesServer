package app.models;

import java.util.Date;

/**
 * Created by cjl20 on 2016/2/29.
 */
public class Record {
    private String id;
    private String name;
    private Date date;
    private int type;

    public Record() {
    }

    public Record(String id, String name, Date date, int type) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Record{" +
                "id='" + id + '\'' +
                ", date=" + date +
                '}';
    }
}
