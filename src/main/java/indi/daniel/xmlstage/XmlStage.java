package indi.daniel.xmlstage;

import indi.daniel.xmlstage.beans.Stage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by daniel on 2017/2/25.
 */
public class XmlStage {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/xmlstage/StageContext.xml");

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
