package org.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "client")
@NamedQuery(name = "Clients.getAll", query = "SELECT c from Clients c")

public class Clients {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "idClient", nullable = false)
    private int id;
    @Column (name = "name", length = 255)
    private String name;

    @Column (name = "isDelited")
    private boolean isDeleted;

    @ManyToOne
    @JoinColumn(name = "idStylists")
    private Stylists idStylists;

    public Clients(int id, String name, boolean isDeleted, Stylists idStylists) {
        this.id = id;
        this.name = name;
        this.isDeleted = isDeleted;
        this.idStylists = idStylists;
    }

    public Clients() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Stylists getIdStylists() {
        return idStylists;
    }

    public void setIdStylists(Stylists idStylists) {
        this.idStylists = idStylists;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}
