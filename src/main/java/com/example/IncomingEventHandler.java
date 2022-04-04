package com.example;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class IncomingEventHandlerImpl implements IncomingEventHandler {

	@Override
	public void handle(DataContainer dataContainer) {
		System.out.println(dataContainer.member);
	}
}
