package com.kh.practiceTotal;

import java.util.List;
import java.util.Map;

public class KekeoTalkServiceGServie implements KekeoTalkService {


    @Override
    public boolean sendMessage(String recipient, String message) {
        // 수신자 이름 메세지명
        return false;
    }

    @Override
    public Map<String, List<String>> viewMessagesHistory() {
        // 읽고자 하는 사람  이사람이 보낸 메세지 기록들
        return Map.of();
    }
}
