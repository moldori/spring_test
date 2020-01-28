package hu.flowacademy.musicstore.models;

import lombok.Data;

import javax.persistence.Embeddable;


@Embeddable
public enum Genre {
    POP, ROCK, FOLK, FUNKY, RAP, ELECTRIC, SOUL
}
