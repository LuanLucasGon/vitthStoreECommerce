package com.example.vitthstore.user.usecase.impl;

import com.example.vitthstore.shared.security.UserPrincipal;
import com.example.vitthstore.user.infrastructure.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return userRepository.findByEmail(email)
                .map(entity -> new UserPrincipal(entity.getId(), entity.getEmail(), entity.getPassword()))
                .orElseThrow(() -> new UsernameNotFoundException("User not found with email: " + email));
    }
}
