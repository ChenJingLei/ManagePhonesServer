package app.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by cjl20 on 2016/5/15.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "User")
@Entity
public class User {
    @Id
    @GenericGenerator(name = "idGenerator", strategy = "uuid") //这个是hibernate的注解/生成32位UUID
    @GeneratedValue(generator = "idGenerator")
    @Column(name = "uid", columnDefinition = "VARCHAR(32)", length = 32)
    private String id;

    @Column(name = "uname", columnDefinition = "VARCHAR(20)", length = 20)
    private String name;

    @Column(name = "uusername", columnDefinition = "VARCHAR(50)", length = 50)
    private String username;

    @Column(name = "upassword", columnDefinition = "VARCHAR(20)", length = 20)
    private String password;

    @Column(name = "umail", columnDefinition = "VARCHAR(50)", length = 50)
    private String mail;

    @Column(name = "ucompany", columnDefinition = "VARCHAR(100)", length = 100)
    private String company;

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", mail='" + mail + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
