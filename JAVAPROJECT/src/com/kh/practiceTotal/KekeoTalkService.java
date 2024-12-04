package com.kh.practiceTotal;

import java.util.List;
import java.util.Map;

public interface KekeoTalkService {

    /** 메세지 보내기
     * @param recipient 수신자 이름
     * @param message   메세지 내용
     * @return          메시지 전송 성공 여부
     */
    boolean sendMessage(String recipient, String message);

    /** 메세지 보낸 기록 확인
     * @return 보낸 메세지와 전체 기록(String = 메세지를 보고자 하는 사람 List<String> = 메세지를 보고자 하는 사람이 보낸 기록들을 리스트로 표기)
     */
    Map<String, List<String>> viewMessagesHistory();
}
