package com.lmw.service.impl;

import com.lmw.beans.Admin;
import com.lmw.mapper.AdminMapper;
import com.lmw.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin login(Admin admin) {
        return adminMapper.login(admin);
    }

    @Override
    public List<Admin> getAllAdmin() {
        return adminMapper.getAllAdmin();
    }
}
