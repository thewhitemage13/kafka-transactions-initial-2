package by.javaguru.estore.DepositService.handler;

import by.javaguru.payments.ws.core.events.DepositRequestedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@KafkaListener(topics = "deposit-money-topic", containerFactory = "kafkaListenerContainerFactory")
public class DepositRequestedEventHandler {
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@KafkaHandler
	public void handle(@Payload DepositRequestedEvent depositRequestedEvent) {
		LOGGER.info("Received a new deposit event: {} ", depositRequestedEvent.getAmount());
	}
}
