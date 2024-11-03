package ua.edu.ucu.apps.user;

import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(path = "/app-user")
public class AppUserController {

  private final AppUserService appUserService;

  @Autowired
  public AppUserController(AppUserService appUserService) {
    this.appUserService = appUserService;
  }

  @GetMapping
  List<AppUser> getUsers() {
    return appUserService.getAppUsers();
  }

  @PostMapping
  public AppUser addAppUser(@RequestBody AppUser newAppUser) throws BadRequestException {
    return appUserService.addAppUser(newAppUser);

  }
}
