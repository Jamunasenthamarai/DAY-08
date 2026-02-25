interface logger{
	void log(String message);
}
 class filelogger implements logger{
	public void log(String message) {
	   System.out.println("file logger:"+message);
	}
}
 class consolelogger implements logger{
		public void log(String message) {
		   System.out.println("console logger:"+message);
		}
 }
		class Main {
		    public static void main(String[] args) {
		        logger l;

		        l = new consolelogger();
		        l.log("System Started");

		        l = new filelogger();
		        l.log("Error occurred");
		    }
 }
 
