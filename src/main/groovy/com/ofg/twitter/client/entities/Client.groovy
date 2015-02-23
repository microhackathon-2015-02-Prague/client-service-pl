package com.ofg.twitter.client.entities

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id


@Entity
class Client {

    @Id @GeneratedValue
    private Long id;

    private String name;
    private String surname;
    private int age;
    private String loanId;

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    String getSurname() {
        return surname
    }

    void setSurname(String surname) {
        this.surname = surname
    }

    int getAge() {
        return age
    }

    void setAge(int age) {
        this.age = age
    }

    String getLoanId() {
        return loanId
    }

    void setLoanId(String loanId) {
        this.loanId = loanId
    }

    Long getId() {
        return id
    }

    void setId(Long id) {
        this.id = id
    }
}
