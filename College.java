
public class College {
			String institution;
			String nickname;
			int undergraduates;
			int graduates;
			int faculty;

			// complete this constructor
			public College(String inst, String nick, int ugStu, int gradStu, int fac) {
				institution = inst;
				nickname = nick;
				undergraduates = ugStu;
				graduates = gradStu;
				faculty = fac;
				
			}
			
			public String getInstitution() {
				return  institution;
			}
			
			public  String getNickname() {
				return  nickname;
			}
			
			public  int getUndergraduate() {
				return  undergraduates;
			}
			
			public  int getFaculty() {
				return  faculty;
			}
			
			public int getGraduate() {
				return  graduates;
			}
			
			public int getTotalEnroll() {
				return graduates + undergraduates;
			}
			
			public double getFacultyEnrollRatio() {
				return (double)faculty/((double)undergraduates + (double)graduates);
			}
			public String toString(){
				 return institution + " " + nickname + " " + undergraduates + " " + graduates + " " + faculty;
				 }

			// you can use this tester to make sure your toString and constructor works
			public static void main(String[] args) {
				College one = new College("Brown University","Bears",6670,3061,736);
				System.out.println(one);	}
		

	}

	
