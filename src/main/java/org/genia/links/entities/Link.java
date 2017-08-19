package org.genia.links.entities;

import javax.inject.Named;
import javax.persistence.*;
import java.util.List;

@Named
@Entity
public class Link {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "link_id")
    private Integer id;
    private String name;
    private String url;
    private String comment;

    @ManyToMany
    @JoinTable(name = "Flag",
            joinColumns = @JoinColumn(name = "link_id"),
            inverseJoinColumns = @JoinColumn(name = "flag_id"))
    private List<Flag> flags;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public List<Flag> getFlags() {
        return flags;
    }

    public void setFlags(List<Flag> flags) {
        this.flags = flags;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
