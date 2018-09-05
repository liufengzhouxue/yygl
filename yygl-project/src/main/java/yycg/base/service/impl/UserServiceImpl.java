package yycg.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yycg.base.dao.SysuserMapperCustom;
import yycg.base.mapper.SysuserMapper;
import yycg.base.pojo.Sysuser;
import yycg.base.pojo.vo.SysuserCustom;
import yycg.base.pojo.vo.SysuserQueryVo;
import yycg.base.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private SysuserMapper sysuserMapper;
    @Autowired
    private SysuserMapperCustom sysuserMapperCustom;
    @Override
    public Sysuser findUserById(String id) {
        return sysuserMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SysuserCustom> findSysuserList(SysuserQueryVo sysuserQueryVo) {
        return sysuserMapperCustom.findSysuserList(sysuserQueryVo);
    }

    @Override
    public int findSysuserCount(SysuserQueryVo sysuserQueryVo) {
        return sysuserMapperCustom.findSysuserCount(sysuserQueryVo);
    }
}
