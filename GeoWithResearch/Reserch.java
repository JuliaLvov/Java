package GeoWithResearch;

import java.util.ArrayList;



public class Reserch {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;

    public Reserch(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<String> spend(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.fullName == p.fullName && t.re == re) {
                result.add(t.p2.fullName);
            }
        }
        return result;
    }

    public ArrayList<String> oldierPerson(int age) {
        for (Node t : tree) {
            if (t.p1.age > age) {
                result.add(t.p1.fullName + " " + t.p1.age + " лет");
            }
        }
        return result;
    }

    public ArrayList<String> viewGender(String gender){
        for (Node t : tree){
            if(t.p1.getGender() == gender) result.add(t.p1.fullName + " " + t.p1.gender);
        }
        return result;
    }
}       




