package com.xworkz.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MailChimpReport implements Serializable {

	private static final long serialVersionUID = 1L;

	private long opens;
	private long uniqueOpens;
	private String openRate;
	private long clicks;
	private long subscriberClicks;
	private long clickRate;
	private MailChimpEcommerce ecommerce;

	public MailChimpReport() {
		super();
	}

}