public class OgrenciBilgiSistemi {
    public static void main(String[] args) {

        Course ders1 = new Course ("FİZİK","485","FZK");
        Course ders1S = new Course ("FİZİK","485","FZK");
        Course ders2 = new Course ("COGRAFYA","426","CGRF");
        Course ders2S = new Course ("COGRAFYA","426","CGRF");
        Course ders3 = new Course("TARİH","412","TRH");
        Course ders3S = new Course("TARİH","412","TRH");


        Teacher t1 = new Teacher("Özkan Hoca","905055454","FZK");
        Teacher t2 = new Teacher ("Yetiş Hoca","1581784","CGRF");
        Teacher t3 = new Teacher ("Önder Hoca","5618564","TRH");


        ders1.addTeacher(t1);
        ders2.addTeacher(t2);
        ders3.addTeacher(t3);



        Student s1 = new Student
                ("Hülya SEÇKİN","125",4,ders1,ders2,ders3,ders1S,ders2S,ders3S);
        s1.addBulkExamNotes
                (70,80,90,100,80,80);
        s1.isPass();



        Student s2 = new Student
                ("Sezgin SAĞLAM","402",4,ders1,ders2,ders3,ders1S,ders2S,ders3S);
        s2.addBulkExamNotes
                (90,70,60,80,100,70);
        s2.isPass();




        Student s3 = new Student
                ("Ceren Deniz DURU","141",4,ders1,ders2,ders3,ders1S,ders2S,ders3S);
        s3.addBulkExamNotes
                (40,20,60,60,50,40);

        s3.isPass();





    }
}
