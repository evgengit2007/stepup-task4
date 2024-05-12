package ru.stepup.course2.model;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "LOGINS")
public class Logins {
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "login_id_seq")
    @SequenceGenerator(name = "login_id_seq", sequenceName = "login_id_seq", allocationSize = 1)
    private Long id;
    @Column(name = "access_date")
    private Timestamp accessDate;

//    @Column(name = "user_id", nullable = false)
//    private Long userId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Users users;
    @Column(name = "application")
    private String application;

    public Logins() {
    }

    public Logins(Timestamp accessDate, Users users, String application) {
        this.accessDate = accessDate;
        this.users = users;
        this.application = application;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getAccessDate() {
        return accessDate;
    }

    public void setAccessDate(Timestamp accessDate) {
        this.accessDate = accessDate;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
