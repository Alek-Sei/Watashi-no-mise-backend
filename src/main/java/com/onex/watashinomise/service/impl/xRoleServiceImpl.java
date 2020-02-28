// package com.onex.watashinomise.service.impl;

// import com.onex.watashinomise.model.Role;
// import com.onex.watashinomise.repository.RoleRepository;
// import com.onex.watashinomise.service.RoleService;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// @Service
// public class RoleServiceImpl implements RoleService {
//     final RoleRepository roleRepository;
//     @Autowired
//     private RoleServiceImpl(RoleRepository roleRepository) {
//         this.roleRepository = roleRepository;
//     }
//     @Override
//     public Role add(Role role) {
//         Role savedRole = roleRepository.save(role);
//         return savedRole;
//     }
//     @Override
//     public Role getByName(String name) {
//         return roleRepository.findByUsername(name);
//     }
//     @Override
//     public Role getRole(Long id) {
//         return roleRepository.findById(id).filter(u -> u.getId().equals(id)).orElse(null);
//     }
// }