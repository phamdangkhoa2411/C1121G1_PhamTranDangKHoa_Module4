package com.example.form_user.service.impl;

import com.example.form_user.model.User;
import com.example.form_user.repository.IUserRepository;
import com.example.form_user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    IUserRepository iUserRepository;

    @Override
    public Page<User> fildAll(Pageable pageable) {
        return this.iUserRepository.findAll(pageable);
    }

    @Override
    public void save(User user) {
        this.iUserRepository.save(user);
    }
}
