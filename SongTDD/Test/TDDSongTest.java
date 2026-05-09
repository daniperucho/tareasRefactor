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

    @Test
    public void testSpiderFly() {
        TDDSong s = new TDDSong();
        assertEquals("There was an old lady who swallowed a spider.\n" +
                "I don't know why she swallowed a spider - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a fly;\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the fly to catch the spider;\n" +
                "I don't know why she swallowed a spider - perhaps she'll die!\n", s.Song(List.of("spider", "fly")));
    }

    @Test
    public void testFlySpiderBird() {
        TDDSong s = new TDDSong();
        assertEquals("There was an old lady who swallowed a fly.\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a spider;\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the spider to catch the fly;\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a bird;\n" +
                "How absurd to swallow a bird.\n" +
                "She swallowed the bird to catch the spider,\n" +
                "She swallowed the spider to catch the fly;\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n" +
                "\n", s.Song(List.of("fly", "spider", "bird")));
    }

    @Test
    public void testBirdFlySpider(){
        TDDSong s = new TDDSong();
        assertEquals("There was an old lady who swallowed a bird.\n" +
                "I don't know why she swallowed a bird - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a fly;\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the fly to catch the bird;\n" +
                "I don't know why she swallowed a bird - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a spider;\n" +
                "How absurd to swallow a spider.\n" +
                "She swallowed the spider to catch the fly,\n" +
                "She swallowed the fly to catch the bird;\n" +
                "I don't know why she swallowed a bird - perhaps she'll die!\n" +
                "\n", s.Song(List.of("bird", "fly", "spider")));
    }
}