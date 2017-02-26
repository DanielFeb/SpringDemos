package indi.daniel.stageapp.beans;

/**
 * Created by daniel on 2017/2/25.
 */
public class SongProgramme implements IProgramme {
    private String songName;
    private IPerformer performer;

    public SongProgramme(IPerformer performer) {
        this.performer = performer;
    }

    public SongProgramme(String songName, IPerformer performer) {
        this.songName = songName;
        this.performer = performer;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public IPerformer getPerformer() {
        return performer;
    }

    public void setPerformer(IPerformer performer) {
        this.performer = performer;
    }

    public String getProgrammeName() {
        return this.getSongName();
    }

    public void start() {
        System.out.println("Enjoy the song (" + songName +
                ") performed by (" + performer.getName() + ") !");
    }
}
