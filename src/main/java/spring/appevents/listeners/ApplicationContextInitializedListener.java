package spring.appevents.listeners;

import org.springframework.boot.context.event.ApplicationContextInitializedEvent;
import org.springframework.context.ApplicationListener;

public class ApplicationContextInitializedListener implements ApplicationListener<ApplicationContextInitializedEvent>
{
  @Override
  public void onApplicationEvent( ApplicationContextInitializedEvent event)
  {
    System.out.println("ApplicationContextInitializedListener::onApplicationEvent() event=" + event);
  }
}
