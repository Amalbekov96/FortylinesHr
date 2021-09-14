package hr.fortylines.com.Security;

import hr.fortylines.com.Models.Dto.UsersDto;
import hr.fortylines.com.Models.Users;
import hr.fortylines.com.Repository.UsersRepo;
import hr.fortylines.com.Service.Impl.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUsersDetailService implements UserDetailsService {

    @Autowired
    private UsersService usersService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UsersDto userDto = usersService.findByUsername(username);
        if (userDto == null) {
            throw new UsernameNotFoundException(username);
        }
        return new MyUserPrincipal(userDto);
    }
}
