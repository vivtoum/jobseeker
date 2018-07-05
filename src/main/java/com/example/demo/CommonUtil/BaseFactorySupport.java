package com.example.demo.CommonUtil;

import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.data.repository.core.support.RepositoryFactorySupport;

import javax.persistence.EntityManager;

public class BaseFactorySupport {

    protected RepositoryFactorySupport createRepositoryFactory(EntityManager entityManager) {
        return new JpaRepositoryFactory(entityManager);
    }

}
