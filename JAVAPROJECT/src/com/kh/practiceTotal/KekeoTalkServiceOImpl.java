package com.kh.practiceTotal;

import java.util.List;
import java.util.Map;

public class KekeoTalkServiceOImpl implements KekeoTalkService {


    @Override
    public boolean sendMessage(String recipient, String message) {
        // 메세지 보내는 사람
        // 만약에 내 케케오톡 프로필로 오픈채팅대화 메세지 보낼 것인가
        //          말썽쟁이 KHT 라는 임의의 프로필로 메세지를 보낼 것인가
        // 메세지 보내는 사람 메세지 보내기

        return false;
    }

    @Override
    public Map<String, List<String>> viewMessagesHistory() {
        return Map.of();
    }
}
