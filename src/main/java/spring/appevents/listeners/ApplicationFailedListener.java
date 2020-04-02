package spring.appevents.listeners;

import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

public class ApplicationFailedListener implements ApplicationListener<ApplicationFailedEvent>
{
  @Override
  public void onApplicationEvent( ApplicationFailedEvent event)
  {
    System.out.println("++++++++++++++++++ event: " + event);
  }
}