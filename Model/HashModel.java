package Model;

import java.util.HashMap;
import java.util.List;

import Controller.iGetModel;

public class HashModel implements iGetModel{
    private HashMap<Long,Student> hashMapStudents;
    private List<Student> students; 

    public HashModel(HashMap<Long,Student> hashMapStudents) {
        this.hashMapStudents = hashMapStudents;
    }

    public HashModel(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudents()
    {
        return students;
    }

    @Override
    public HashMap<Long, Student> getAllHashMapStudents() {
        return hashMapStudents;
    }
}
