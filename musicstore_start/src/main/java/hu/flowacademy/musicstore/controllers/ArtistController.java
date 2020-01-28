package hu.flowacademy.musicstore.controllers;

import hu.flowacademy.musicstore.models.Album;
import hu.flowacademy.musicstore.models.Artist;
import hu.flowacademy.musicstore.services.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/artists")
public class ArtistController {

    @Autowired
    private ArtistService artistService;

    @GetMapping
    public List<Artist> findAll() {
        return artistService.findAll();
    }


    @PostMapping
    public Artist createArtist(@RequestBody Artist artist) {
        return artistService.saveArtist(artist);
    }

    @PutMapping
    public Artist updateArtist(@RequestBody Artist artist ) {
        return artistService.updateArtist(artist);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        artistService.delete(id);
        return ResponseEntity.ok().build();
    }

}
