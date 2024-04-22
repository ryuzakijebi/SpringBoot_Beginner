package jebihendardi.springbeginner.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import jebihendardi.springbeginner.event.LoginSuccessEvent;

@Component
@Slf4j
public class LoginAgainSuccessListener implements ApplicationListener<LoginSuccessEvent> {

  @Override
  public void onApplicationEvent(LoginSuccessEvent event) {
    log.info("Success login again for user {}", event.getUser());
  }
}
