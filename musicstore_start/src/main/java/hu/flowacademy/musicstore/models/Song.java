package hu.flowacademy.musicstore.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Data
@Table
public class Song {

    @Id
    private Long id;

    @Column
    private String title;

    @Column
    private Long length;

    @Column
    private String lyrics;

    @Column
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate year;

    @Column
    private String writerName;

    @Column
    private Genre genre;

    @Column
    private Artist artist;

    @Column
    private Album album;



}
