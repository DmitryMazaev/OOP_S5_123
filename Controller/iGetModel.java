﻿package Controller;

import java.util.HashMap;
import java.util.List;

import Model.Student;

public interface iGetModel {
    public List<Student> getAllStudents();
    public HashMap<Long, Student> getAllHashMapStudents();
}
