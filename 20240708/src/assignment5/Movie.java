package assignment5;

import java.util.List;

public class Movie extends Media implements Playable {
    private List<String> sounds;
    private List<String> images;

    public Movie(String content, List<String> sounds, List<String> images) {
        super(content);
        this.sounds = sounds;
        this.images = images;
    }

    @Override
    public String play() {
        StringBuilder playOutput = new StringBuilder();
        int size = Math.min(sounds.size(), images.size());
        for (int i = 0; i < size; i++) {
            playOutput.append(sounds.get(i)).append(images.get(i));
        }
        return playOutput.toString();
    }
}
