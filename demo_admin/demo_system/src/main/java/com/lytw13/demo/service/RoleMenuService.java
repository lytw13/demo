package com.lytw13.demo.service;

import com.lytw13.demo.model.BaseResult;
import com.lytw13.demo.model.TbRoleMenu;

public interface RoleMenuService {
    BaseResult save(TbRoleMenu roleMenu);

    BaseResult delete(Integer id);
}
