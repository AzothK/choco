package com.market.choco.service;

import com.market.choco.domain.User;
import com.market.choco.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor //final 로 선언된 클래스 변수를 생성자로 연결해준다.
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public Long join(User user){

        // 중복체크?

        // 이메일인증?

        userRepository.save(user);
        return user.getUserId();
    }
}
