import java.util.UUID;

public class Song {
    private UUID id;
    private String artist;
    private String title;
    private int hour;
    private int minute;
    private int second;
    
    public Song(String artist, String title, int hour, int minute, int second) {
        this.id = UUID.randomUUID();
        this.artist = artist;
        this.title = title;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public UUID getId() {
        return id;
    }
    
    public String getArtist() {
        return artist;
    }
    
    public String getTitle() {
        return title;
    }
    
    public int getHour() {
        return hour;
    }
    
    public int getMinute() {
        return minute;
    }
    
    public int getSecond() {
        return second;
    }
    
    public void play() {
        int totalSeconds = hour * 3600 + minute * 60 + second;
        System.out.println("Lagu sedang diputar");
        for (int i = 0; i <= totalSeconds; i++) {
            System.out.printf("%02d:%02d:%02d%n", i / 3600, (i / 60) % 60, i % 60);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Lagu selesai diputar");
    }
    
    @Override
    public String toString() {
       
        return  ">> "+ title + " - " + artist;
    }
}                
