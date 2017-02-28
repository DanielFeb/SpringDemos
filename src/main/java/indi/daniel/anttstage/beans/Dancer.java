package indi.daniel.anttstage.beans;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;

/**
 * Created by daniel on 2017/2/25.
 */

public class Dancer implements IPerformer {

    private String name = "";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
