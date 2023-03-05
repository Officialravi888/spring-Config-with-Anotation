package org.example;

//@Component
public class Student {
   private Samosa samosa;

    public Student(Samosa samosa) {
        this.samosa = samosa;
    }

    public Samosa getSamosa() {
        return samosa;
    }

    public void setSamosa(Samosa samosa) {
        this.samosa = samosa;
    }

    public void Study(){
        samosa.display();
        System.out.println("reading is a book");
    }
}
