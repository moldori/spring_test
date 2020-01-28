package hu.flowacademy.musicstore.services;

import hu.flowacademy.musicstore.models.Album;
import hu.flowacademy.musicstore.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AlbumService {

    @Autowired
    private AlbumRepository albumRepository;

    public List<Album> findAll() {
        return albumRepository.findAll();
    }

    public Album saveAlbum(Album album) {
        return albumRepository.save(album);
    }

    public Album updateAlbum(Album album) {
        Album oldAlbum = albumRepository.findById(album.getId());
        oldAlbum.setCount(album.getCount());
        oldAlbum.setTitle(album.getTitle());
        return albumRepository.save(oldAlbum);
    }

    public void delete(Long id) {
        albumRepository.deleteById(id);
    }



}
