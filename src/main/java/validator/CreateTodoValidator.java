package validator;

public final class CreateTodoValidator {
	
	public void validate(String text) throws Exception {
		if (text == null || (text != null && text.length() == 0)) {
			throw new Exception("Text is too short");
		}
	}
}