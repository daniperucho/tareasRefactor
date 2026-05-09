import java.util.List;

public class TDDSong {
    public String Song(List<String> animals){
        if (animals.isEmpty())
        return "";
        if (animals.size() == 1 && animals.get(0).equals("fly")){
            return "There was an old lady who swallowed a fly.\n" +
                    "I don't know why she swallowed a fly - perhaps she'll die!\n";
        }
        return "";
    }
}
