package edu.nf.users.dao.impl;

import edu.nf.users.dao.UserDao;
import edu.nf.users.entity.Users;
import edu.nf.users.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public void addUser(Users users) {
        try(SqlSession sqlSession=MybatisUtils.getSqlSession(true)){
            sqlSession.getMapper(UserDao.class).addUser(users);
        }catch (RuntimeException e){
            throw e;
        }
    }

    @Override
    public List<Users> listUser() {
        try(SqlSession sqlSession=MybatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(UserDao.class).listUser();
        }catch (RuntimeException e){
            throw e;
        }
    }
}
