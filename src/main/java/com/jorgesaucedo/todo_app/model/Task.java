package com.jorgesaucedo.todo_app.model;

import com.sun.istack.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Task {
    //Auto generated ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Task Description
    private String description;

    //boolean to know if it is Task complete?
    private boolean complete;

    //Add a date when task is created
    @Temporal(TemporalType.DATE)
    @DateTimeFormat ( pattern="dd/mm/yyyy")
    @Column(name = "createAt")
    private Date createAt;

    //Add a due date
    @Temporal(TemporalType.DATE)
    @DateTimeFormat ( pattern="yyyy-MM-dd")
    @Column(name = "dueDate")
    private Date dueDate;

    public Task() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}
