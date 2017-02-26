package indi.daniel.stageapp.beans;


import java.util.Iterator;
import java.util.List;

/**
 * Created by daniel on 2017/2/25.
 */
public class Stage {
    private List<IProgramme> programmeList;

    public List<IProgramme> getProgrammeList() {
        return programmeList;
    }

    public void setProgrammeList(List<IProgramme> programmeList) {
        this.programmeList = programmeList;
    }

    public void startShows(){
        Iterator<IProgramme> iterator = programmeList.iterator();
        while (iterator.hasNext()){
            iterator.next().start();
        }
    }
}
