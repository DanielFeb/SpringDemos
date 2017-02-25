package indi.daniel.spdm.xmlbean.demo;

import indi.daniel.spdm.PathConstants;
import indi.daniel.spdm.xmlbean.demo.beans.IPerformer;
import indi.daniel.spdm.xmlbean.demo.beans.IProgramme;
import indi.daniel.spdm.xmlbean.demo.beans.Stage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daniel on 2017/2/25.
 */
public class XmlBeanApp {
    public static void main(String[] args){
        List<String> contextLocations = new ArrayList<String>();
        contextLocations.add(PathConstants.ROOT_PATH + "xmlbean/resources/ProgrammesContext.xml");
        contextLocations.add(PathConstants.ROOT_PATH + "xmlbean/resources/StageContext.xml");

        ApplicationContext applicationContext = new FileSystemXmlApplicationContext(contextLocations.toArray(new String[0]));

//        IPerformer performer = (IPerformer) applicationContext.getBean("singerLee");
//        System.out.println(performer.getName());

//        IProgramme songProgramme = (IProgramme) applicationContext.getBean("songProgramme");
//        songProgramme.start();
//        IProgramme danceProgramme = (IProgramme) applicationContext.getBean("danceProgramme");
//        danceProgramme.start();

        Stage stage = (Stage) applicationContext.getBean("stage");
        stage.startShows();
    }
}
