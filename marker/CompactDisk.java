package gr.aueb.cf.ch16.marker;

public class CompactDisk implements Item{
    private long id;
    private String tile;

    public CompactDisk () {

    }

    public CompactDisk(long id, String tile) {
        this.id = id;
        this.tile = tile;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTile() {
        return tile;
    }

    public void setTile(String tile) {
        this.tile = tile;
    }

    @Override
    public String toString() {
        return "CompactDisk{" +
                "id=" + id +
                ", tile='" + tile + '\'' +
                '}';
    }
}
