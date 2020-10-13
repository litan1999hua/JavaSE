package com.litan_06;

public class StudentDemo {
    public static void main(String[] args) {
//        useStudentBuilder((String name,int age) -> {
////            Student s = new Student(name,age);
////            return s;
//            return new Student(name,age);
//        });

//        useStudentBuilder(((name, age) -> new Student(name,age)));

        //引用构造器
        useStudentBuilder(Student::new);

        //Lambda表达式被构造器替代的时候，它的形式参数全部传递给构造器作为参数
    }

    private static void useStudentBuilder(StudentBuilder sb){
        Student s = sb.build("林青霞", 30);
        System.out.println(s.getName() + "," + s.getAge());
    }
}
