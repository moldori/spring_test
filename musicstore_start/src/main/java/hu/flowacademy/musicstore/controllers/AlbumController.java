package hu.flowacademy.musicstore.controllers;

import hu.flowacademy.musicstore.models.Album;
import hu.flowacademy.musicstore.services.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/albums")
public class AlbumController {

    @Autowired
    private AlbumService albumService;

    @GetMapping
    public List<Album> findAll() {
        return albumService.findAll();
    }


    @PostMapping
    public Album createAlbum(@RequestBody Album album) {
        return albumService.saveAlbum(album);
    }

    @PutMapping
    public Album updateAlbum(@RequestBody Album album ) {
        return albumService.updateAlbum(album);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        albumService.delete(id);
        return ResponseEntity.ok().build();
    }


}
