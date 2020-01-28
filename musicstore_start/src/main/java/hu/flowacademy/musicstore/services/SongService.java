package hu.flowacademy.musicstore.services;

import hu.flowacademy.musicstore.models.Artist;
import hu.flowacademy.musicstore.models.Song;
import hu.flowacademy.musicstore.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SongService {

    @Autowired
    private SongRepository songRepository;

    public List<Song> findAll() {
        return songRepository.findAll();
    }

    public Song saveSong(Song song) {
        return songRepository.save(song);
    }

    public Song updateSong(Song song) {
        Song oldSong = songRepository.findById(song.getId());
        oldSong.setTitle(song.getTitle());
        oldSong.setLength(song.getLength());
        oldSong.setLyrics(song.getLyrics());
        oldSong.setYear(song.getYear());
        oldSong.setWriterName(song.getWriterName());
        oldSong.setGenre(song.getGenre());
        oldSong.setArtist(song.getArtist());
        oldSong.setAlbum(song.getAlbum());
        return songRepository.save(oldSong);
    }

    public void delete(Long id) {
        songRepository.deleteById(id);
    }

}
