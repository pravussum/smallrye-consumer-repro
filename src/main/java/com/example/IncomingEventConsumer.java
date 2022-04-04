package com.example;

import java.util.concurrent.CompletionStage;

import javax.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.eclipse.microprofile.reactive.messaging.Message;

@ApplicationScoped
public class IncomingEventConsumer {

	@Incoming("incoming-events")
	public CompletionStage<Void> consumeIncomingRequest(Message<DataContainer> incomingRequest) {
		return incomingRequest.ack();
	}

}
