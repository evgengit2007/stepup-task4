package ru.stepup.course2.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "USERS")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "user_id_seq")
    @SequenceGenerator(name = "user_id_seq", sequenceName = "user_id_seq", allocationSize = 1)
    private Long id;
    @Column
    private String username;
    @Column
    private String fio;

    public Users() {
    }

    public Users(String username, String fio) {
        this.username = username;
        this.fio = fio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

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
