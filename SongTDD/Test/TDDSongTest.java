import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TDDSongTest {
    @Test
    public void testListaVacia(){
        TDDSong s = new TDDSong();
        assertEquals("", s.Song(List.of()));
    }

    @Test
    public void testFly(){
        TDDSong s = new TDDSong();
        assertEquals("There was an old lady who swallowed a fly.\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n", s.Song(List.of("fly")));
    }

    @Test
    public void testSpider() {
        TDDSong s = new TDDSong();
        assertEquals("There was an old lady who swallowed a spider.\n" +
                "I don't know why she swallowed a spider - perhaps she'll die!\n", s.Song(List.of("spider")));
    }

    @Test
    public void testFlySpider() {
        TDDSong s = new TDDSong();
        assertEquals("There was an old lady who swallowed a fly.\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a spider;\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the spider to catch the fly;\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n", s.Song(List.of("fly", "spider")));
    }
}