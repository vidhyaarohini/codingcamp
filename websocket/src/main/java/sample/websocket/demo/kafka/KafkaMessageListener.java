package sample.websocket.demo.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class KafkaMessageListener {
    private final List<WebSocketSession> sessions = new CopyOnWriteArrayList<>();

    @KafkaListener(topics = "chat-topic", groupId = "chat-group")
    public void listen(String message) {
        for (WebSocketSession session : sessions) {
            try {
                session.sendMessage(new TextMessage(message));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void registerSession(WebSocketSession session) {
        sessions.add(session);
    }
}

