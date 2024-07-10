package assignment5;

import java.util.List;

public class Music extends Media implements Playable {
    private List<String> sounds;

    public Music(String content, List<String> sounds) {
        super(content);
        this.sounds = sounds;
    }

    @Override
    public String play() {
        return String.join("", sounds);
    }
}
