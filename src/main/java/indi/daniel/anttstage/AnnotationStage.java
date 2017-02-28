package indi.daniel.anttstage;

import indi.daniel.anttstage.beans.IPerformer;
import indi.daniel.anttstage.beans.Stage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by daniel on 2017/2/25.
 */
public class AnnotationStage {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/anttstage/AnnotationContext.xml");

        IPerformer performer = (IPerformer) applicationContext.getBean(IPerformer.class);
        System.out.println(performer.getName());

//        IProgramme songProgramme = (IProgramme) applicationContext.getBean("songProgramme");
//        songProgramme.start();
//        IProgramme danceProgramme = (IProgramme) applicationContext.getBean("danceProgramme");
//        danceProgramme.start();

//        Stage stage = (Stage) applicationContext.getBean("stage");
//        stage.startShows();
    }
}
