package indi.daniel.spdm.xmlbean.demo.beans;

/**
 * Created by daniel on 2017/2/25.
 */
public class Singer implements IPerformer {

    private String name;

    public Singer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
