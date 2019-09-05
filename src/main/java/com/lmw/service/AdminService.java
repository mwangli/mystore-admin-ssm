package com.lmw.service;

import com.lmw.beans.Admin;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface AdminService {

    List<Admin> login(Admin admin);

    List<Admin> getAllAdmin();
}
