package com.myhome.services;

import com.myhome.domain.HouseMember;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface HouseMemberService {

    Optional<Page<HouseMember>> findAllMembersByUser(String userId, Pageable pageable);

}
