package com.zerobase.cafebom.admin.service;

import com.zerobase.cafebom.admin.dto.AdminOptionCategoryForm;
import org.springframework.stereotype.Service;

@Service
public interface AdminOptionCategoryService {

    // 관리자 옵션 카테고리 등록 -jiyeon-23.09.05
    void addOptionCategory(AdminOptionCategoryForm.Request optionCategoryFormRequest);
}