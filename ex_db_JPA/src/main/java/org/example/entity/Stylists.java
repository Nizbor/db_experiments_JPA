package org.example.entity;
import javax.persistence.*;

@Entity
@Table(name = "stylists")
@NamedQuery(name = "Stylists.getAll", query = "SELECT s from Stylists s")
public class Stylists {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idStylists", nullable = false)
    private int id;

    @Column(name = "S_name", length = 255)
    private String S_name;

    @Column(name = "S_idDeleted")
    private  boolean S_isDeleted;
    public Stylists(int id, String name, boolean S_isDeleted) {
        this.id = id;
        this.S_name = name;
        this.S_isDeleted = S_isDeleted;
    }

    public Stylists() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return S_name;
    }

    public void setName(String name) {
        this.S_name = name;
    }

    public String getS_name() {
        return S_name;
    }

    public void setS_name(String s_name) {
        S_name = s_name;
    }

    public boolean getIsDeleted() {
        return S_isDeleted;
    }

    public void setS_isDeleted(boolean s_isDeleted) {
        S_isDeleted = s_isDeleted;
    }
}