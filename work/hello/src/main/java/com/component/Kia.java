package com.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javaclass.Engine;

@Component
@Scope("prototype")
public class Kia {

	@Autowired
	private Engine engine;

	public Kia(Engine engine) {
		super();
		this.engine = engine;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}
