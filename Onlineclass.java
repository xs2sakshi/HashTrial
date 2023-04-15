public class OnlineClass{

String studName;
int studId;
String studCourse;

public boolean equals(Object obj){
  if (obj==null){
  result=false;}
  else
  {
  OnlineClass oc1=(OnlineClass)obj;
  if(this.studId==oc1.getStudId() && this.studName==oc1.getStudname())
  result=true;
  }}
  return result;
  }
  
  pubilc int hashcode(){
    int hash =17;
    hash=hash+hash*studId
    hash=hash+hash*studName.hashcode();
    return hash
    }
    
  public int getStudId() {
	return employeeNumber;
	}
	public void settudId(final int studId) {
	this.studId = studId;
	}
	public String getStudName() {
	return studName;
  
  public void setstudName(String studName) {
	this.studName = studName;
	}
	public String getstudCourse() {
	return studCourse;
		}
		public void setstudCourse(String studCourse) {
		this.studCourse = studCourse;
		}
 
 }
