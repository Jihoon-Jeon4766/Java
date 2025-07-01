package generic_wildcard;

import java.util.Arrays;

public class WildCardExample {

	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
	}
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
	}
	//Worker 클래스이거나
	//Worker 클래스의 부모 클래스들
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Course<Person> personCourse=new Course<Person>("일반인과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		
		Course<Worker> workerCourse = new Course<Worker>("직장인과정", 5);
		workerCourse.add(new Worker("직장인"));
		
		Course<Student> studentCourse= new Course<Student>("학생과정", 5);
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));
		
		Course<HighStudent> highStudentCourse= new Course<HighStudent>("고등학생", 5);
		highStudentCourse.add(new HighStudent("고등학생"));
		
		registerCourse(personCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		registerCourse(workerCourse);
		System.out.println();
		
		registerCourseStudent(highStudentCourse);
		registerCourseStudent(studentCourse);
		System.out.println();
		
		registerCourseWorker(workerCourse);
		registerCourseWorker(personCourse);
		System.out.println();
	}

}
