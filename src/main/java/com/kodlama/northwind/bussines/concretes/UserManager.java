package com.kodlama.northwind.bussines.concretes;

import com.kodlama.northwind.bussines.abstractss.UserService;
import com.kodlama.northwind.core.dataAccess.UserDao;
import com.kodlama.northwind.core.entities.User;
import com.kodlama.northwind.core.utilities.results.DataResult;
import com.kodlama.northwind.core.utilities.results.Result;
import com.kodlama.northwind.core.utilities.results.SuccessDataResult;
import com.kodlama.northwind.core.utilities.results.SuccessResult;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserManager implements UserService {

    private UserDao userDao;

    @Override
    public Result add(User user) {
        this.userDao.save(user);
        return new SuccessResult("Kullanıcı eklendi");
    }

    @Override
    public DataResult<User> findByEmail(String email) {
        return new SuccessDataResult<User>(this.userDao.findByEmail(email),"Kullanıcı bulundu");
    }
}
