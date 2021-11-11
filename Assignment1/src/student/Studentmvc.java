package student;

public class Studentmvc {

		// TODO Auto-generated method stub
		private int id;
		private String Name;
		private String MathMark;
		private String ScienceMark;
		@Override
		public String toString() {
			return "Studentmvc [id=" + id + ", Name=" + Name + ", MathMark=" + MathMark + ", ScienceMark=" + ScienceMark
					+ "]";
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getMathMark() {
			return MathMark;
		}
		public void setMathMark(String mathMark) {
			MathMark = mathMark;
		}
		public String getScienceMark() {
			return ScienceMark;
		}
		public void setScienceMark(String scienceMark) {
			ScienceMark = scienceMark;
		}
		public Studentmvc(int id, String name, String mathMark, String scienceMark) {
			
			this.id = id;
			Name = name;
			MathMark = mathMark;
			ScienceMark = scienceMark;
		}
		public Studentmvc() {
			
		}
		


	
}
