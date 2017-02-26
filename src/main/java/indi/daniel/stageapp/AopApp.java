package indi.daniel.stageapp;

import indi.daniel.stageapp.beans.Stage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by daniel on 2017/2/25.
 */
public class AopApp {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("AOPContext.xml");
        Stage stage = (Stage) applicationContext.getBean("stage");
        stage.startShows();
    }

}
