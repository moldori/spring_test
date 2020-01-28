package hu.flowacademy.musicstore.controllers;

import hu.flowacademy.musicstore.models.Artist;
import hu.flowacademy.musicstore.models.Song;
import hu.flowacademy.musicstore.services.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/songs")
public class SongController {

    @Autowired
    private SongService songService;

    @GetMapping
    public List<Song> findAll() {
        return songService.findAll();
    }


    @PostMapping
    public Song createSong(@RequestBody Song song) {
        return songService.saveSong(song);
    }

    @PutMapping
    public Song updateSong(@RequestBody Song song ) {
        return songService.updateSong(song);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        songService.delete(id);
        return ResponseEntity.ok().build();
    }
}
