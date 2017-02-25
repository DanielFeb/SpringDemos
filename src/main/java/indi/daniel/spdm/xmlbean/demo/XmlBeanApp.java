package indi.daniel.spdm.xmlbean.demo;

import indi.daniel.spdm.PathConstants;
import indi.daniel.spdm.xmlbean.demo.beans.IPerformer;
import indi.daniel.spdm.xmlbean.demo.beans.IProgramme;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by daniel on 2017/2/25.
 */
public class XmlBeanApp {
    public static void main(String[] args){
        ApplicationContext applicationContext =
                new FileSystemXmlApplicationContext(PathConstants.ROOT_PATH + "xmlbean/resources/XmlBeanDemo.xml");
//        IPerformer performer = (IPerformer) applicationContext.getBean("singerLee");
//        System.out.println(performer.getName());
        IProgramme songProgramme = (IProgramme) applicationContext.getBean("songProgramme");
        songProgramme.start();
        IProgramme danceProgramme = (IProgramme) applicationContext.getBean("danceProgramme");
        danceProgramme.start();
    }
}
