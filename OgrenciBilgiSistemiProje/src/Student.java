public class Student {
    String name;
    String StuNo;
    int classes;
    Course ders1;
    Course ders2;
    Course ders3;
    Course ders1S;
    Course ders2S;
    Course ders3S;
    double avarage;
    double avarage1;
    double avarage2;
    double avarage3;
    boolean isPass;

    Student(String name, String StuNo,int classes,Course ders1,Course ders2,Course ders3,
            Course ders1S,Course ders2S,Course ders3S){

        this.name = name;
        this.StuNo = StuNo;
        this.classes = classes;
        this.isPass = false;
        this.ders1 = ders1;
        this.ders2= ders2;
        this.ders3 = ders3;
        this.ders1S = ders1S;
        this.ders2S = ders2S;
        this.ders3S = ders3S;

    }

    public void addBulkExamNotes(int ders1 ,int ders2,int ders3,int ders1S,int ders2S,int ders3S){
        if(ders1>=0 && ders1<=100){
            this.ders1.note = ders1;
        }
        if(ders2>=0 && ders2<=100){
            this.ders2.note = ders2;
        }
        if (ders3>=0 && ders3<=100) {
            this.ders3.note = ders3;
        }
        if(ders1S>=0 && ders1S<=100) {
            this.ders1S.note = ders1S;
        }
        if(ders2S>=0 && ders2S<=100){
            this.ders2S.note = ders2S;
        }
        if(ders3S>=0 && ders3S<=100){
            this.ders3S.note = ders3S;
        }
    }

     public void isPass(){
         if (this.ders1.note == 0 || this.ders2.note == 0 || this.ders3.note == 0
          ||this.ders1S.note == 0 ||this.ders2S.note == 0 || this.ders3S.note == 0) {
           System.out.println("Notlar tam olarak girilmemiş");
         }else{
             this.isPass = isCheckPass();
             printNote();
             System.out.println("Ortalama : "+this.avarage);
             if(this.isPass){
                 System.out.println("Tebrikler,geçtiniz! Yol zor ama sonu güzel..");
             }else{
                 System.out.println("Biraz sabır biraz gayret.Seneye görüşmek üzere!");

             }
         }

     }
    public void calcAvarage(){
        this.avarage1 = ((this.ders1.note*0.80))+((this.ders1S.note*0.20));
        this.avarage2 = ((this.ders2.note*0.80))+((this.ders2S.note*0.20));
        this.avarage3 = ((this.ders3.note*0.80))+((this.ders3S.note*0.20));
        this.avarage =(this.avarage1+this.avarage2+this.avarage3)/(3.0);
    }
     public boolean isCheckPass(){
        calcAvarage();
        return this.avarage>55;
     }
     public void printNote(){
         System.out.println("---------------------");
         System.out.println("Öğrenci : "+this.name);
         System.out.println("FİZİK NOTU : "+this.avarage1);
         System.out.println("COĞRAFYA NOTU : "+this.avarage2);
         System.out.println("TARİH NOTU : "+this.avarage3);


     }

}
