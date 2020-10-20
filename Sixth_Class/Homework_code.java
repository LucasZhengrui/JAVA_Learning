package Test;

public class Student{
	   String number;
	   String classnum;
	   String name;
	   String sex;
	   int age;

	 public Student() {

	 }

	 public Student(String number, String classnum, String name, String sex,
	   int age) {
	  super();
	  this.number = number;
	  this.classnum = classnum;
	  this.name = name;
	  this.sex = sex;
	  this.age = age;
	 }

	 public String getnumber() {
	  return number;
	 }

	 public void setnumber(String number) {
	  this.number = number;
	 }

	 public String getclassnum() {
	  return classnum;
	 }

	 public void setclassnum(String classnum) {
	  this.classnum = classnum;
	 }

	 public String getname() {
	  return name;
	 }

	 public void setname(String name) {
	  this.name = name;
	 }

	 public String getsex() {
	  return sex;
	 }

	 public void setsex(String sex) {
	  this.sex = sex;
	 }

	 public int getage() {
	  return age;
	 }

	 public void setage(int age) {
	  this.age = age;
	 }
	}
