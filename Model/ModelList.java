package Model;

import java.util.HashMap;
import java.util.List;

import Controller.iGetModel;

public class ModelList implements iGetModel {
    private List<Student> students;

    public ModelList(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudents()
    {
        return students;
    }

    @Override
    public HashMap<Long, Student> getAllHashMapStudents() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllHashMapStudents'");
    }
}
