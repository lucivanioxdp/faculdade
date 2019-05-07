package com.unip.aps.questionario;

public class QuestionarioException extends Exception{

	public QuestionarioException(){
	}
	public QuestionarioException(String message){
		super(message);
	}
	public QuestionarioException(String message, Throwable cause){
		super(message, cause);
	}

	public QuestionarioException(Throwable cause){
		super(cause);
	}
}