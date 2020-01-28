package hu.flowacademy.musicstore.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table
public class Artist {

    @Id
    private Long id;

    @Column
    private String firstname;

    @Column
    private String lastname;

}
