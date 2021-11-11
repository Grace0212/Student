package student;

public class Controller {
	private Studentmvc model;
	private StudentView view;
	
	public Controller(Studentmvc model,StudentView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setStuId(int id) {
		model.setId(id);
	}
	public int getStuId() {
		return model.getId();
	}
	
	public void setStuName(String Name) {
		model.setName(Name);
	}
	public String getStuName() {
		return model.getName();
	}
	public void setStuMathMark(String mathMark) {
		model.setMathMark(mathMark);
	}
	public String getStuMathMark() {
		return model.getMathMark();
		
	}
	public void setStuScienceMark(String scienceMark) {
		model.setScienceMark(scienceMark);
	}
	public String getStuScienceMark() {
		return model.getScienceMark();
		
	}
	public void selectView() {
		view.printStudent(model.getId(),model.getName(),model.getMathMark(),model.getScienceMark());
		
	}
	
}
