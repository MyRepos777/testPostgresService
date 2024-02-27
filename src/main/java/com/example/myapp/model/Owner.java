package com.example.myapp.model;

import javax.persistence.*;

/**
 * Created by Gudilin on 26.02.2024.
 */
@Entity
@Table(name = "owners")
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "owner_id")
    private Long id;

    @Column(name = "name")
    private String name;


    @Column(name = "email")
    private String email;


    @Column(name = "phone")
    private String phone;

    public Long getId() {
        return id;
    }


    // ��������� �������
    public void setId(Long id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }
}
