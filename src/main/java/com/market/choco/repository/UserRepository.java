package com.market.choco.repository;

import com.market.choco.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@RequiredArgsConstructor
@Repository
public class UserRepository {

    private final EntityManager em;

    public void save(User user){
        em.persist(user);
    }
}
