public class Course {
    Teacher CourseTeacher;
    String name;
    String code;
    String prefix;
    int note;



    public Course(String name,String code,String prefix){
        this.name = name ;
        this.code = code ;
        this.prefix = prefix ;
        this.note = 0 ;

    }
    public void addTeacher(Teacher t){
        if(this.prefix.equals(t.branch)){
            this.CourseTeacher=t;
            System.out.println("İşlem Başarılı ! ");

        }else{
            System.out.println("Öğretmen ve Ders Bölümleri Uyuşmuyor!");
        }
    }
    public void printTeacher() {
        if (CourseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + CourseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}




