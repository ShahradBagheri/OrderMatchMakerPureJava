package model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public abstract class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    protected String email;

    protected String password;
}
