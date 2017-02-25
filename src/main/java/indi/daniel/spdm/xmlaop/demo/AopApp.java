package indi.daniel.spdm.xmlaop.demo;

import indi.daniel.spdm.PathConstants;
import indi.daniel.spdm.xmlbean.demo.beans.Stage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daniel on 2017/2/25.
 */
public class AopApp {
    public static void main(String[] args){
        List<String> contextLocations = new ArrayList<String>();
        contextLocations.add(PathConstants.ROOT_PATH + "xmlbean/resources/ProgrammesContext.xml");
        contextLocations.add(PathConstants.ROOT_PATH + "xmlbean/resources/StageContext.xml");
        contextLocations.add(PathConstants.ROOT_PATH + "xmlaop/resources/AOPContext.xml");

        ApplicationContext applicationContext = new FileSystemXmlApplicationContext(contextLocations.toArray(new String[0]));

        Stage stage = (Stage) applicationContext.getBean("stage");
        stage.startShows();
    }

}
