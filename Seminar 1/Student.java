/*
Să se construiască o clasă Student cu următoarele câmpuri private: nume (string), note (int[]). Clasa trebuie să conțină un constructor cu un parametru
(numele de tip String) și o metodă publică void adaugaNota(int nota) pentru adăugarea unei note.

1.     Să se construiască și să se afișeze o listă cu cel puțin 3 studenți și notele aferente.

2.     Să se salveze într-un fișier text lista studenților ordonați în funcție de medie (câte un student pe fiecare linie).


*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student implements Comparable{

    //public int[] note;
    private String nume;
    private int[] note;



    public Student(String nume) {
        this.nume = nume;
    }

    public void adaugaNota(int nota)
    {

        int[] note1;

        if(note!=null) //acest if cu o singura linie putea fi scris folosind operatorul ternar
        {
            note1=new int[note.length+1];
        }
        else
        {
            note1=new int[1];
        }
        if(note!=null) {
            for (int i = 0; i < note.length - 1; i++) {
                note1[i] = note[i];
            }
            note1[note.length] = nota;
            note = note1;
        }
        else {
            note = new int[1];
            note[0]=nota;
        }
    }

    @Override
    public String toString() {
        return nume+" " + Arrays.toString(note);
    }

    @Override
    public int compareTo(Object o) {
        return this.compareTo(this.note);
    }
}

class Main
{
    public static void main(String[] args) throws IOException {//ar trebui spatii intre declaratiile de variabile/constructori
        List<Student> slist = new ArrayList<>(); //ar trebui sa am un nume mai intuitiv aici, studentList spre ex
        Student s1 = new Student("Vasile"); //puteam sa scriu direct Student s1=new Student("Vasile").adaugaNota(4); pentru economie de spatiu
        s1.adaugaNota(4);
        Student s2 = new Student("Mihai");
        s2.adaugaNota(5);
        Student s3 = new Student("Laurentiu");
        s3.adaugaNota(6);
//totodata lipsesc in totalitate comentariile, nu explic exact ce se intampla in codul meu, ce adaug, de ce adaug etc.
        slist.add(s1);slist.add(s2);slist.add(s3);

        for (Student s:
             slist) {
            System.out.println(s.toString());

        }//acest forEach putea fi scris pe o singura linie

        FileWriter fw = new FileWriter("studenti.txt");
        BufferedWriter br = new BufferedWriter(fw);

        String pLinie;

        for (Student s:slist
             ) {
            br.append(s.toString());
        }

        //programul ruleaza pentru cerinta 1. cerinta 2 nu am apucat sa o rezolv in totalitate



    }
}



