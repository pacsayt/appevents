package spring.appevents.listeners;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class ApplicationReadyListener implements ApplicationListener<ApplicationReadyEvent>
{
  @Override
  public void onApplicationEvent( ApplicationReadyEvent event)
  {
    System.out.println("ApplicationReadyListener::onApplicationEvent() event: " + event);
  }
}