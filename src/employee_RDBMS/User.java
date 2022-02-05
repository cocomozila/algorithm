package employee_RDBMS;

public class User {
	
	private int user_no;
	private String user_id;
	private String user_pw;
	private String user_email;
	private int user_rate;
	
	private User(Builder builder) {
		this.user_no = builder.user_no;
		this.user_id = builder.user_id;
		this.user_pw = builder.user_pw;
		this.user_email = builder.user_email;
		this.user_rate = builder.user_rate;
	}
	
	public static Builder builder() {
		return new Builder();
	}	
	
	public int getUser_no() {
		return user_no;
	}

	public String getUser_id() {
		return user_id;
	}

	public String getUser_pw() {
		return user_pw;
	}

	public String getUser_email() {
		return user_email;
	}

	public int getUser_rate() {
		return user_rate;
	}
	
	@Override
	public String toString() {
		return user_no+" "+user_id+" "+user_email;
	}

	public static class Builder {
		
		private int user_no;
		private String user_id;
		private String user_pw;
		private String user_email;
		private int user_rate;
		
		public Builder user_no(int user_no) {
			this.user_no = user_no;
			return this;
		}
		
		public Builder user_id(String user_id) {
			this.user_id = user_id;
			return this;
		}
		
		public Builder user_pw(String user_pw) {
			this.user_pw = user_pw;
			return this;
		}
		
		public Builder user_email(String user_email) {
			this.user_email = user_email;
			return this;
		}
		
		public Builder user_rate(int user_rate) {
			this.user_rate = user_rate;
			return this;
		}
		
		public User build() {
			return new User(this);
		}		
	}	
}
