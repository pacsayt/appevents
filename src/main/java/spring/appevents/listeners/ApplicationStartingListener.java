package spring.appevents.listeners;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

public class ApplicationStartingListener implements ApplicationListener<ApplicationStartingEvent>
{
  @Override
  public void onApplicationEvent( ApplicationStartingEvent event)
  {
    System.out.println("ApplicationStartingListener::onApplicationEvent() event=" + event);
  }
}