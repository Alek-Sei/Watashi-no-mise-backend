// package com.onex.watashinomise.service.impl;

// import com.onex.watashinomise.exception.EmailAlreadyExistsException;
// import com.onex.watashinomise.exception.UserNameAlreadyExistsException;
// import com.onex.watashinomise.model.Role;
// import com.onex.watashinomise.model.User;
// import com.onex.watashinomise.repository.UserRepository;
// import com.onex.watashinomise.service.RoleService;
// import com.onex.watashinomise.service.UserService;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.core.Authentication;
// import org.springframework.security.core.context.SecurityContextHolder;
// import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
// import org.springframework.stereotype.Service;

// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;
// import java.util.List;

// @Service
// public class UserServiceImpl implements UserService {
//     private final UserRepository userRepository;
//     private final RoleService roleService;
//     @Autowired
//     private UserServiceImpl(UserRepository userRepository, RoleService roleService) {
//         this.userRepository = userRepository;
//         this.roleService = roleService;
//     }
//     @Override
//     public User findOne(Long id) {
//         return userRepository.getOne(id);
//     }
//     @Override
//     public List<User> getUserList() {
//         return userRepository.findAll();
//     }
//     @Override
//     public User register(User user) throws EmailAlreadyExistsException, UserNameAlreadyExistsException {
//         if (userRepository.findByUsername(user.getUsername()) == null) {
//             if (userRepository.findByEmail(user.getEmail()) == null) {
//                 Role role = roleService.getByName(user.getRole().getName());
//                 user.setRole(role);
//                 return userRepository.save(user);
//             } else throw new EmailAlreadyExistsException(user.getEmail());
//         } else throw new UserNameAlreadyExistsException(user.getUsername());
//     }
//     @Override
//     public String logout(HttpServletRequest request, HttpServletResponse response) {
//         Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//         if (auth != null) {
//             new SecurityContextLogoutHandler().logout(request, response, auth);
//         }
//         return "Success";
//     }
// }