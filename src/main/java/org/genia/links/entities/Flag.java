package org.genia.links.entities;

import javax.inject.Named;
import javax.persistence.*;

@Named
@Entity
public class Flag {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "flag_id")
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
