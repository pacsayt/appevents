package spring.appevents;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import spring.appevents.listeners.*;

import java.util.Arrays;
import java.util.HashSet;

/*
   4.1.6. Application Events and Listeners
   https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#using-boot-whats-next
 */

@SpringBootApplication
public class AppeventsApplication
{
  // pt++ : egyik listener sem hivodik meg
  public static void main(String[] args) throws InterruptedException
  {
    System.out.println("AppeventsApplication:main() BEGIN");

    SpringApplication springApplication = new SpringApplication();

    System.out.println("AppeventsApplication:main() SpringApplication::addListeners() ELOTT");

    springApplication.addListeners( new ApplicationReadyListener(),
                                    new ApplicationFailedListener(),
                                    new ApplicationEnvironmentPreparedListener(),
                                    new ApplicationContextInitializedListener(),
                                    new ApplicationStartingListener(),
                                    new ApplicationStartedListener(),
                                    new ApplicationPreparedListener());

    HashSet<String> applicationSet = new HashSet<>();
    applicationSet.add( "AppeventsApplication.class");
    springApplication.setSources( applicationSet);

    System.out.println("AppeventsApplication:main() SpringApplication::run() ELOTT");

    ConfigurableApplicationContext context = springApplication.run( AppeventsApplication.class, args);

    System.out.println("AppeventsApplication:main() END");
  }
}