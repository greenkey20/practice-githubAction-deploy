package com.codestates.practicegithubActiondeploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 2022.12.8(목) 14h10 접속 확인/성공 -> controller 없애고, 아까 404 페이지 안 보였던 것 다시 띄워보기
/* 혹시 Github Actions로 실습 진행하는 도중에 자꾸만 어제 진행한 파이프라인 실습 결과물이 실행된다면 해당 프로세스를 죽이고 다시 진행해주세요! 두 실습의 빌드 결과물 저장 경로가 달라서 파일 자체를 지울 필요는 없지만, 이미 실행중인 애플리케이션 서버는 종료해주세요
나의 경우에는 sudo kill -9 {어제 실습 프로젝트.jar의 pid} 하고, 이 프로젝트 내용 수정해서 push했더니, GitHub Actions가 빌드하고 실행해줌(이 때는 오늘 프로젝트가 실행됨)
 */
@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "hello world! hello backend bootcamp! we are the best!";
    }

}