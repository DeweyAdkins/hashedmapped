package org.example;
import java.util.HashMap;
public class mathew {
    public static void main(String[] args) {
        HashMap<String, String> nicknames = new HashMap<>();

        nicknames.put("mathew", "matt");
        nicknames.put("micheal", "mix");
        nicknames.put("arthur", "artie");
        String mathewsNickname = nicknames.get("mathew");
        System.out.println("Mathews nickname is: " + mathewsNickname);

    }
}