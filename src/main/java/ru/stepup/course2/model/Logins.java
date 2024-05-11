package ru.stepup.course2.model;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "LOGINS")
public class Logins {
    private Integer id;
    private Timestamp accessDate;
    private Integer userId;
    private String application;

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "ALL_SEQ")
    @SequenceGenerator(name = "ALL_SEQ", sequenceName = "ALL_SEQ", allocationSize = 1)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "access_date")
    public Timestamp getAccessDate() {
        return accessDate;
    }

    public void setAccessDate(Timestamp accessDate) {
        this.accessDate = accessDate;
    }

    @Basic
    @Column(name = "user_id", nullable = false)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "application")
    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }
}
