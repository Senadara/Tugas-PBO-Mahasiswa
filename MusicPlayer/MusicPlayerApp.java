import java.util.ArrayList;
import java.util.Scanner;


public class MusicPlayerApp {
    static ArrayList<Song> songs = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Input data lagu");
            System.out.println("2. Memainkan lagu");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    inputSongData(input);
                    break;
                case 2:
                    playSong(input);
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan Music Player App");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (choice != 3);
    }

    static void inputSongData(Scanner input) {
        System.out.print("Masukkan nama penyanyi: ");
        String artist = input.next();
        System.out.print("Masukkan judul lagu: ");
        String title = input.next();
        System.out.print("Masukkan durasi lagu (jam): ");
        int hour = input.nextInt();
        System.out.print("Masukkan durasi lagu (menit): ");
        int minute = input.nextInt();
        System.out.print("Masukkan durasi lagu (detik): ");
        int second = input.nextInt();
        Song song = new Song(artist, title, hour, minute, second);
        songs.add(song);
        System.out.println("Data lagu telah disimpan");
    }

    static void playSong(Scanner input) {
        System.out.println("Cari lagu berdasarkan:");
        System.out.println("1. Judul lagu");
        System.out.println("2. Penyanyi");
        System.out.print("Pilihan Anda: ");
        int searchBy = input.nextInt();
        ArrayList<Song> result = new ArrayList<>();
        switch (searchBy) {
            case 1:
                System.out.print("Masukkan judul lagu: ");
                String title = input.next();
                for (Song song : songs) {
                    if (song.getTitle().toLowerCase().contains(title.toLowerCase())) {
                        result.add(song);
                    }
                }
                break;
            case 2:
                System.out.print("Masukkan nama penyanyi: ");
                String artist = input.next();
                for (Song song : songs) {
                    if (song.getArtist().toLowerCase().contains(artist.toLowerCase())) {
                        result.add(song);
                    }
                }
                break;
            default:
                System.out.println("Pilihan tidak valid");
                return;
        }
        if (result.size() == 0) {
            System.out.println("Tidak ditemukan lagu yang sesuai");
        } else {
            System.out.println("Lagu yang ditemukan:");
            for (Song song : result) {
                System.out.println(song);
            }
            System.out.print("Pilih lagu untuk diputar: ");
            int selectedSongIndex = input.nextInt() - 1;
            if (selectedSongIndex < 0 || selectedSongIndex >= result.size()) {
                System.out.println("Indeks lagu tidak valid");
            } else {
                Song selectedSong = result.get(selectedSongIndex);
                System.out.println("Memutar lagu: " + selectedSong.getTitle() + " - " + selectedSong.getArtist());
                selectedSong.play();
                }
                
            }
            
        }
        
    }
                
               