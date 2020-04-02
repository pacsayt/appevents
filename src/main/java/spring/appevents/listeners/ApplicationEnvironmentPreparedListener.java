package spring.appevents.listeners;

import org.springframework.boot.context.event.ApplicationContextInitializedEvent;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;

public class ApplicationEnvironmentPreparedListener implements ApplicationListener<ApplicationEnvironmentPreparedEvent>
{
  @Override
  public void onApplicationEvent( ApplicationEnvironmentPreparedEvent event)
  {
    System.out.println("ApplicationEnvironmentPreparedListener::onApplicationEvent() event=" + event);
  }
}