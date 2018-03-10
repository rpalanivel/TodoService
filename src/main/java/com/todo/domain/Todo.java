package com.todo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;


@Entity
public class Todo {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

    @NotBlank
    @Size(max=100)
    @Column(unique=true) 
    private String title;

    private Boolean completed = false;

    public Todo() {
        super();
    }

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
    
    public Todo(String title) {
        this.title = title;
    }

    /*public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }*/
    
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return String.format(
                "Todo[id=%s, title='%s', completed='%s']",
                id, title, completed);
    }
}
