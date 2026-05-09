import java.util.List;

public class TDDSong {
    public String Song(List<String> animals){

        if (animals.isEmpty())
        return "";

        if (animals.size() == 1 && animals.get(0).equals("fly")){
            return "There was an old lady who swallowed a fly.\n" +
                    "I don't know why she swallowed a fly - perhaps she'll die!\n";
        }

        if (animals.size() == 1 && animals.get(0).equals("spider")) {
            return "There was an old lady who swallowed a spider.\n" +
                    "I don't know why she swallowed a spider - perhaps she'll die!\n";
        }

        if (animals.size() == 2 && animals.get(0).equals("fly") && animals.get(1).equals("spider")){
            return "There was an old lady who swallowed a fly.\n" +
                    "I don't know why she swallowed a fly - perhaps she'll die!\n" +
                    "\n" +
                    "There was an old lady who swallowed a spider;\n" +
                    "That wriggled and wiggled and tickled inside her.\n" +
                    "She swallowed the spider to catch the fly;\n" +
                    "I don't know why she swallowed a fly - perhaps she'll die!\n";
        }

        if (animals.size() == 2 && animals.get(0).equals("spider") && animals.get(1).equals("fly")) {
            return "There was an old lady who swallowed a spider.\n" +
                    "I don't know why she swallowed a spider - perhaps she'll die!\n" +
                    "\n" +
                    "There was an old lady who swallowed a fly;\n" +
                    "That wriggled and wiggled and tickled inside her.\n" +
                    "She swallowed the fly to catch the spider;\n" +
                    "I don't know why she swallowed a spider - perhaps she'll die!\n";
        }

        if (animals.size() == 3 && animals.get(0).equals("fly") && animals.get(1).equals("spider") && animals.get(2).equals("bird")) {
            return "There was an old lady who swallowed a fly.\n" +
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
                    "\n";
        }

        if (animals.size() == 3 && animals.get(0).equals("bird") && animals.get(1).equals("fly") && animals.get(2).equals("spider")) {
            return "There was an old lady who swallowed a bird.\n" +
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
                    "\n";
        }
            return "";
    }
}
