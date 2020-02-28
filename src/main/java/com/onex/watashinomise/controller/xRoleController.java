// package com.onex.watashinomise.controller;

// import com.onex.watashinomise.model.Role;
// import com.onex.watashinomise.service.RoleService;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.*;

// @RequestMapping("/role")
// @RestController
// @CrossOrigin(origins = "*")
// public class RoleController {
//     final RoleService roleService;
//     @Autowired
//     public RoleController(RoleService roleService) {
//         this.roleService = roleService;
//     }
//     @PostMapping(name = "/add")
//     public Role addRole(@RequestBody Role role) {
//         return roleService.add(role);
//     }
//     @GetMapping(value = "/{id}")
//     public Role getRole(@PathVariable Long id) {
//         return roleService.getRole(id);
//     }
// }