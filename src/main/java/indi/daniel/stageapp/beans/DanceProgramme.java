package indi.daniel.stageapp.beans;

/**
 * Created by daniel on 2017/2/25.
 */
public class DanceProgramme implements IProgramme {


    private String danceName;
    private IPerformer performer;

    public String getDanceName() {
        return danceName;
    }

    public void setDanceName(String danceName) {
        this.danceName = danceName;
    }

    public IPerformer getPerformer() {
        return performer;
    }

    public void setPerformer(IPerformer performer) {
        this.performer = performer;
    }

    public String getProgrammeName() {
        return this.danceName;
    }

    public void start() {
        System.out.println("Enjoy the dancing (" + danceName +
                ") performed by (" + performer.getName() + ") !");
    }
}
