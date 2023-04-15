public class OnlineClass{

String studName;
int studId;
String studCourse;


boolean result=true;

public boolean equals(Object obj){
  if (obj==null){
  result=false;}
  else
  {
  OnlineClass oc1=(OnlineClass)obj;
  if(this.studId==oc1.getStudId() && this.studName==oc1.getStudName())
  result=true;
  }
  return result;
  }
  
  public int hashCode(){
    int hash =17;
    hash=hash+hash*studId;
    hash=hash+hash*studName.hashCode();
    return hash;
    }
    
  public int getStudId() {
	return studId;
	}
  
	public void setStudId(final int studId) {
	this.studId = studId;
	}
	public String getStudName() {
	return studName;
	}
  
  public void setStudName(String studName) {
	this.studName = studName;
	}
	public String getStudCourse() {
	return studCourse;
		}
		public void setStudCourse(String studCourse) {
		this.studCourse = studCourse;
		}
 
 }
