package Service;

import Data.*;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService {
    private Teacher teacher;
    private List<Student> studentList;

    public StudyGroupService(Teacher teacher, List<Student> studentList) {
        this.teacher = teacher;
        this.studentList = studentList;
    }

    public StudyGroupService() {

    }

    public StudyGroup create(Teacher teacher, List<Student> studentList, Type studygroup) {

        return null;
    }


    public List<Student> getStudentID() {
        List<Student> resultList = new ArrayList<>();
        for(Student student : studentList){
            if (student instanceof Student){
                resultList.add(student);
            }
        }
        return resultList;
    }

    public Teacher getTeacherID() {
        Teacher teacher = new Teacher();

        return teacher;
    }
}
