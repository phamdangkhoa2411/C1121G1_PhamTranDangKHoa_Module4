package com.example.form_user.service;

import com.example.form_user.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IUserService {
    Page<User> fildAll(Pageable pageable);
    void save(User user);
}
