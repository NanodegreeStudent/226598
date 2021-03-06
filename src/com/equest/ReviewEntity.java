package com.equest;

public class ReviewEntity {
	
	private String question_description;
	private int  question_id;
	private String answer_opt;
	private int is_correct;
	private String answer_image;
	private String question_image;
	
	
	
	public ReviewEntity() {
		super();
		this.question_description = "";
		this.question_id = 0;
		this.answer_opt = "";
		this.is_correct = 0;
	}
	
	public ReviewEntity(String question_description, int question_id,
			String answer_opt, int is_correct, String answer_image) {
		super();
		this.question_description = question_description;
		this.question_id = question_id;
		this.answer_opt = answer_opt;
		this.is_correct = is_correct;
		this.answer_image = answer_image;
	}
	
	public String getQuestion_description() {
		return question_description;
	}
	public void setQuestion_description(String question_description) {
		this.question_description = question_description;
	}
	public int getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
	public String getAnswer_opt() {
		return answer_opt;
	}
	public void setAnswer_opt(String answer_opt) {
		this.answer_opt = answer_opt;
	}
	public int getIs_correct() {
		return is_correct;
	}
	public void setIs_correct(int is_correct) {
		this.is_correct = is_correct;
	}

	public String getAnswer_image() {
		return answer_image;
	}

	public void setAnswer_image(String answer_image) {
		this.answer_image = answer_image;
	}

	public String getQuestion_image() {
		return question_image;
	}

	public void setQuestion_image(String question_image) {
		this.question_image = question_image;
	}

	
}
