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
}