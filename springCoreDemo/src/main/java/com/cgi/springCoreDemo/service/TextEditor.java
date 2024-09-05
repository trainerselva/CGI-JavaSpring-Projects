package com.cgi.springCoreDemo.service;

public class TextEditor {

	private SpellChecker spellChecker;

	// Setter method for dependency injection
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}
