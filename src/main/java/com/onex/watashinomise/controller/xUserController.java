// package com.onex.watashinomise.controller;

// import com.onex.watashinomise.exception.EmailAlreadyExistsException;
// import com.onex.watashinomise.exception.UserNameAlreadyExistsException;
// import com.onex.watashinomise.model.User;
// import com.onex.watashinomise.service.UserService;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.access.prepost.PreAuthorize;
// import org.springframework.web.bind.annotation.*;

// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;
// import java.util.List;

// @RequestMapping("/user")
// @RestController
// @CrossOrigin(origins = "*")
// public class UserController {
//     final UserService userService;
//     @Autowired
//     public UserController(UserService userService) {
//         this.userService = userService;
//     }
//     @GetMapping(value = "/list")
//     @PreAuthorize("hasRole('ROLE_ADMIN')")
//     public List<User> roleList() {
//         return userService.getUserList();
//     }
//     @RequestMapping(value = "/register", method = RequestMethod.POST)
//     public User registerUser(@RequestBody User user) throws EmailAlreadyExistsException, UserNameAlreadyExistsException {
//         return userService.register(user);
//     }
//     @RequestMapping(value = "/logout", method = RequestMethod.GET)
//     public String logout(HttpServletRequest request, HttpServletResponse response){
//         return userService.logout(request,response);
//     }
// }