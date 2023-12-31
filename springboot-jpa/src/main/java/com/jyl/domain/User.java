package com.jyl.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class User implements Serializable {


    @Id
    private Long id;
    @Column
    private String name;
    @Column
    private String hobby;
}
