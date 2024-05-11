package ru.stepup.course2.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "USERS")
public class Users {
    private Integer id;
    private String username;
    private String fio;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "ALL_SEQ")
    @SequenceGenerator(name = "ALL_SEQ", sequenceName = "ALL_SEQ", allocationSize = 1)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "username", nullable = false)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "fio", nullable = false)
    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return id == users.id &&
                Objects.equals(id, users.id) &&
                Objects.equals(username, users.username) &&
                Objects.equals(fio, users.fio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, fio);
    }
}
