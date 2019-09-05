package com.lmw.service;

import com.lmw.beans.Category;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface CategoryService {

    List<Category> getAllCategory();
}
