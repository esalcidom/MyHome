package com.myhome.services.springdatajpa;

import com.myhome.domain.HouseMember;
import com.myhome.repositories.HouseMemberRepository;
import com.myhome.services.HouseMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class HouseMemberSDJpaService implements HouseMemberService {

    private final HouseMemberRepository houseMemberRepository;

    @Override
    public Optional<Page<HouseMember>> findAllMembersByUser(String userId, Pageable pageable) {
        return houseMemberRepository.findAllMembersByUser(userId, pageable);
    }

}
