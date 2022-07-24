package edu.kata.task311.model.parent;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@SuppressWarnings("PMD")
@MappedSuperclass
public abstract class NameEntity extends BaseEntity {

    @Basic
    @Column(name = "name")
    private String name;
}
