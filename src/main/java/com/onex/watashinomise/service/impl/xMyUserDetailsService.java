// package com.onex.watashinomise.service.impl;

// import java.util.ArrayList;
// import java.util.Collection;

// import com.onex.watashinomise.model.User;
// import com.onex.watashinomise.repository.UserRepository;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.core.GrantedAuthority;
// import org.springframework.security.core.authority.SimpleGrantedAuthority;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.core.userdetails.UsernameNotFoundException;
// import org.springframework.stereotype.Service;

// @Service
// public class MyUserDetailsService implements UserDetailsService {
//     private final UserRepository userRepository;
//     @Autowired
//     public MyUserDetailsService(UserRepository userRepository) {
//         this.userRepository = userRepository;
//     }
//     @Override
//     public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//         User user = userRepository.findByUsername(username);
//         if(user == null) {
//             throw new UsernameNotFoundException("User name "+ username + " not found");
//         }
//         return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), getGrantedAuthorities(user));
//     }
//     public Collection<GrantedAuthority> getGrantedAuthorities(User user) {
//         Collection<GrantedAuthority> grantedAuthorities = new ArrayList<>();
//         if(user.getRole().getName().equals("admin")) {
//             grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
//         }
//         if(user.getRole().getName().equals("user")) {
//             grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_USER"));
//         }
//         return grantedAuthorities;
//     }
// }