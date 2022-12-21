package intities;

public class Task extends Lesson {
	
	private String description;
	private int questionCount;
	
	public Task() {
		super();
	}
	public Task(String description, int questionCount) {
		super();
		this.description = description;
		this.questionCount = questionCount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuestionCount() {
		return questionCount;
	}
	public void setQuestionCount(int questionCount) {
		this.questionCount = questionCount;
	}
	
	@Override
	public int duration() {
		int aux = 0;
		return aux = questionCount * 300;
	}

}
