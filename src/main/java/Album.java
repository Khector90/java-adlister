public class Album {

    private String Album;
    private String artist;


    public String getAlbum() {
        return Album;
    }
    public  void setAlbum(String album){
        this.Album = Album;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public Album() {
        this.Album = "";
        this.artist = "";
    }
}
