package edu.kata.task311.model;

import edu.kata.task311.model.parent.NameEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Basic;
import javax.persistence.Column;

@Getter
@Setter
public class User extends NameEntity {

    @Basic
    @Column(name = "last_name")
    private String lastName;

    @Basic
    @Column(name = "middle_name")
    private String middleName;
}
