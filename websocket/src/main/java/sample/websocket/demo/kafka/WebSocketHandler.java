package sample.websocket.demo.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component
public class WebSocketHandler extends TextWebSocketHandler {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) {
        kafkaTemplate.send("chat-topic", message.getPayload());
    }
}
