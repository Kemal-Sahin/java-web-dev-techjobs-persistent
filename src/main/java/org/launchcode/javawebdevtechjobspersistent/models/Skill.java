package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;

import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {
    public Skill(){}

    @NotBlank
    @Size(max= 500, message="Description can be up to 500 characters")
    public String description;

    @ManyToMany(mappedBy= "skills")
    private List<Job> jobs = new ArrayList<>();

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}