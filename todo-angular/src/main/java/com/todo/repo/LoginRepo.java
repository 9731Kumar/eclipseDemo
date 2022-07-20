package com.todo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo.modal.LoginModal;

public interface LoginRepo extends JpaRepository<LoginModal, String>{

}
