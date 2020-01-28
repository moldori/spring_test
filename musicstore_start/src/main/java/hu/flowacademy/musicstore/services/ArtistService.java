package hu.flowacademy.musicstore.services;

import hu.flowacademy.musicstore.models.Album;
import hu.flowacademy.musicstore.models.Artist;
import hu.flowacademy.musicstore.repositories.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ArtistService {

    @Autowired
    private ArtistRepository artistRepository;

    public List<Artist> findAll() {
        return artistRepository.findAll();
    }

    public Artist saveArtist(Artist artist) {
        return artistRepository.save(artist);
    }

    public Artist updateArtist(Artist artist) {
        Artist oldArtist = artistRepository.findById(artist.getId());
        oldArtist.setFirstname(artist.getFirstname());
        oldArtist.setLastname(artist.getLastname());
        return artistRepository.save(oldArtist);
    }

    public void delete(Long id) {
        artistRepository.deleteById(id);
    }

}
