package indi.daniel.xmlstage.beans;


import java.util.Iterator;
import java.util.List;

/**
 * Created by daniel on 2017/2/25.
 */
public class Stage {
    private List<IProgramme> programmeList;
    private Light light;

    public Light getLight() {
        return light;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    public List<IProgramme> getProgrammeList() {
        return programmeList;
    }

    public void setProgrammeList(List<IProgramme> programmeList) {
        this.programmeList = programmeList;
    }

    public void startShows(){

        if(light != null){
            light.lightPreparation();
        }else{
            System.out.println("no light!");
        }
        Iterator<IProgramme> iterator = programmeList.iterator();
        while (iterator.hasNext()){
            iterator.next().start();
        }
    }
}
