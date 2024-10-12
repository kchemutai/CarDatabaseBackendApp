package com.packt.cardatabase.service;

import com.packt.cardatabase.domain.AppUser;
import com.packt.cardatabase.repository.AppUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private final AppUserRepository appUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<AppUser> user = appUserRepository.findByUsername(username);
        User.UserBuilder userBuilder = null;
        if(user.isPresent()){
            AppUser currentUser = user.get();
            userBuilder = User.withUsername(username);
            userBuilder.password(currentUser.getPassword());
            userBuilder.roles(currentUser.getRole());
        }
        else {
            throw new UsernameNotFoundException("User not found.");
        }
        return userBuilder.build();
    }
}
