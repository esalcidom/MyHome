package com.myhome.services.unit;

import com.myhome.services.springdatajpa.HouseMemberSDJpaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class HouseMemberSDJpaServiceTest {

    @InjectMocks
    HouseMemberSDJpaService houseMemberSDJpaService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

}
