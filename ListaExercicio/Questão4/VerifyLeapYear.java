
public class VerifyLeapYear {

	private int year;
	
	public int getYear() {
		return year;
	}

	public void setYear(int ano) {
		this.year = ano;
	}
	
	public boolean isLeapYear() {
		if(this.year % 4 == 0) {
			if(this.year % 100 == 0) {
				if(this.year % 400 == 0) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
		} else {
			return false;
		}
	}
}
