package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeReport {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(90,86,56,23,65,78,100,34,87,39,97,14));

        ArrayList<Integer> gradeA=new ArrayList<>();
        gradeA.addAll(list);
        gradeA.removeIf(p->p<90);
        System.out.println("grade A is: "+gradeA+" "+gradeA.size());

        ArrayList<Integer> gradeB=new ArrayList<>();
        gradeB.addAll(list);
        gradeB.removeAll(gradeA);
        gradeB.removeIf(p->p<80);
        System.out.println("grade B is: "+gradeB+" "+gradeB.size());

        ArrayList<Integer> gradeC=new ArrayList<>();
        gradeC.addAll(list);
        gradeC.removeAll(gradeA);
        gradeC.removeAll(gradeB);
        gradeC.removeIf(p->p<70);
        System.out.println("grade C is: "+gradeC+" "+gradeC.size());

        ArrayList<Integer> gradeD=new ArrayList<>();
        gradeD.addAll(list);
        gradeD.removeAll(gradeA);
        gradeD.removeAll(gradeB);
        gradeD.removeAll(gradeC);
        gradeD.removeIf(p->p<60);
        System.out.println("grade D is: "+gradeD+" "+gradeD.size());

        ArrayList<Integer> gradeE =new ArrayList<>();
        gradeE.addAll(list);
        gradeE.removeAll(gradeA);
        gradeE.removeAll(gradeB);
        gradeE.removeAll(gradeC);
        gradeE.removeAll(gradeD);
        gradeE.removeIf(p->p<50);
        System.out.println("grade E is: "+gradeE+" "+gradeE.size());

        ArrayList<Integer>gradeF=new ArrayList<>();
        gradeF.addAll(list);
        gradeF.removeAll(gradeA);
        gradeF.removeAll(gradeB);
        gradeF.removeAll(gradeC);
        gradeF.removeAll(gradeD);
        gradeF.removeAll(gradeE);
        gradeF.removeIf(p->p>40);
        System.out.println("grade F is: "+gradeF+" "+gradeF.size());
    }
}
