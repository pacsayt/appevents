package spring.appevents.listeners;

import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

public class ApplicationStartedListener implements ApplicationListener<ApplicationStartedEvent>
{
  @Override
  public void onApplicationEvent( ApplicationStartedEvent event)
  {
    System.out.println("ApplicationStartedListener::onApplicationEvent() event=" + event);
  }
}