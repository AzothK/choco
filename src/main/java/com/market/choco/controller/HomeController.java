package com.market.choco.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class HomeController {

    // front와 데이터 통신 확인용
    @RequestMapping(value = "/strList", method = RequestMethod.GET)
    public List<String> strList() {

        return Arrays.asList(new String[]{"test1", "test2"});
    }
}
