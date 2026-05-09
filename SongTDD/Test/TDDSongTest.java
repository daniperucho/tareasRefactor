import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TDDSongTest {
    @Test
    public void testListaVacia(){
        TDDSong s = new TDDSong();
        assertEquals("", s.Song(List.of()));
    }

}