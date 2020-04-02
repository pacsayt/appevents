package spring.appevents.listeners;

import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

public class ApplicationPreparedListener implements ApplicationListener<ApplicationPreparedEvent>
{
  @Override
  public void onApplicationEvent( ApplicationPreparedEvent event)
  {
    System.out.println("ApplicationPreparedListener::onApplicationEvent() event=" + event);
  }
}