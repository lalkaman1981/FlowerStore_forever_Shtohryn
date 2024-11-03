package ua.edu.ucu.apps.user;

import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppUserService {
  private AppUserRepository appUserRepository;

  @Autowired
  AppUserService(AppUserRepository appUserRepository) {
    this.appUserRepository = appUserRepository;
  }

  public List<AppUser> getAppUsers() {
    return appUserRepository.findAll();
  }

  public AppUser addAppUser(AppUser user) throws BadRequestException {
    if (appUserRepository.findUserByEmail(user.getEmail()).isEmpty()) {
      return appUserRepository.save(user);
    } else {
      throw new BadRequestException();
    }
  }

}
