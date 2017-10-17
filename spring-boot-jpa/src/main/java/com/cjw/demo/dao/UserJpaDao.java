package com.cjw.demo.dao;

import com.cjw.demo.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The Interface UserJpaDao.
 * @author abel
 */
public interface UserJpaDao extends JpaRepository<User, Long> {

    /**
     * Find by name.
     *
     * @param name the name
     * @return the user
     */
    User findByName(String name);


}