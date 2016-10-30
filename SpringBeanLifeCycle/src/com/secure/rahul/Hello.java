package com.secure.rahul;

public class Hello {
	private String message;

	public void getMessage() {
		System.out.println("Your Message : " + message);
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void init() {
		System.out.println("Called After Properties Set.......(Init)");
	}

	public void destroy() {
		System.out.println("Called just Befeore Destroy.......(Destroy)");
	}

}
