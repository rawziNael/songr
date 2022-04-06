package com.example.songr.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import javax.persistence.*;

@JsonIgnoreProperties({"album"})
@Getter
@Setter
@Entity
//@NoArgsConstructor
@RequiredArgsConstructor
public class Song {
    @Setter(value= AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private int id ;

    //@NonNull
    private String title;

    private int length;
    private int trackNumber;

    @ManyToOne
    Album album ;

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", length=" + length +
                ", trackNumber=" + trackNumber +
                ", album=" + album +
                '}';
    }
}
