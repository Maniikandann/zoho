package combinedassignment5.com.library.member;

public class Member {
	
	    private String memberId;
	    private String name;
	    private int age;

	    public Member(String memberId, String name, int age) {
	        this.memberId = memberId;
	        this.name = name;
	        this.age = age;
	    }

		public String getMemberId() {
			return memberId;
		}

		public void setMemberId(String memberId) {
			this.memberId = memberId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

	   
	}



