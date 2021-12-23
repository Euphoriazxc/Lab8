public class Lab8 {
    public static void main(String[] args) {
        People people =  new People("Ilya","Protopopov",17);
        people.walk();
        people.run();
        people.voice();
        Student student = new Student("Vanya","Nikanorov",19);
        student.walk();
        student.learn();
        Teacher teacher = new Teacher("Baidam","Tobohov",36);
        teacher.voice();
        teacher.teach();
    }
}