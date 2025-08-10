package com.wipro.personpost.entity;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Person {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    public Person(Long id, String name, String email, List<Post> posts) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.posts = posts;
	}

	@OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<Post> posts;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
        if (posts != null) {
            for (Post p : posts) {
                p.setPerson(this);
            }
        }
    }

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
    

}
