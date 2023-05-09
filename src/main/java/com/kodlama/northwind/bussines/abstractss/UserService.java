package com.kodlama.northwind.bussines.abstractss;

import com.kodlama.northwind.core.entities.User;
import com.kodlama.northwind.core.utilities.results.DataResult;
import com.kodlama.northwind.core.utilities.results.Result;

public interface UserService {

    Result add(User user);
    DataResult<User> findByEmail(String email);
}
