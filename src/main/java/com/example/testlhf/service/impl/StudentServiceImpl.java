package com.example.testlhf.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.testlhf.adapter.LoadDataAdapter;
import com.example.testlhf.adapter.StudentLoadDataAdapter;
import com.example.testlhf.adapter.TeacherLoadDataAdapter;
import com.example.testlhf.dao.StudentMapper;
import com.example.testlhf.dao.TeacherMapper;
import com.example.testlhf.entity.Student;
import com.example.testlhf.entity.Teacher;
import com.example.testlhf.request.AddStudentRequset;
import com.example.testlhf.service.StudentService;
import com.example.testlhf.service.TeacherService;
import com.example.testlhf.util.ProgramArgsUtils;
import com.google.common.base.Supplier;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import sun.plugin2.message.GetAppletMessage;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author yyf
 * @since 2020-03-11
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private TeacherService teacherService;
    @Autowired
    private TeacherMapper teacherMapper;
    @Autowired
    private ProgramArgsUtils utils;
    @Autowired
    @Qualifier("sqlSessionTemplate")
    private SqlSession sqlSession;
    @Autowired
    @Qualifier("mySqlSessionTemplate")
    private SqlSession mySqlSession;
    @Autowired
    private StudentLoadDataAdapter studentLoadDataAdapter;
    @Autowired
    private TeacherLoadDataAdapter teacherLoadDataAdapter;

    private List<LoadDataAdapter> adapterList = new ArrayList<>();

    @PostConstruct
    public void StudentServiceImpl() {
        adapterList.add(teacherLoadDataAdapter);
        adapterList.add(studentLoadDataAdapter);
    }

    @Override
//    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED)
    public void testTranscationl() {
        for (int i = 1; i <= 10000; i++) {
            Student student = new Student(i, "student" + i, i, LocalDate.now(), LocalDateTime.now(), LocalDateTime.now());
            studentMapper.insert(student);
        }
    }

    @Override
//    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED)
    public void addTeachers() {

        Teacher teacher1 = new Teacher(2, "teacher2", "29");
        Teacher teacher2 = new Teacher(3, "teacher3", "29");
        teacherMapper.insert(teacher1);
        teacherMapper.insert(teacher2);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED)
    public void addStudents(AddStudentRequset addStudentRequset) {
//        Student student1 = new Student(4, "student4", 30);
//        studentMapper.insert(student1);
//        Student student2 = new Student(5, "student55", 30);
//        studentMapper.insert(student2);
//        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        StudentMapper myMapper = mySqlSession.getMapper(StudentMapper.class);
        myMapper.insert(addStudentRequset.getStudent());
//        Student studentPo = new Student();
//        studentPo.setId(646950);
//        Map<String, Object> map = new HashMap<>();
//        map.put("id", 646950);
//        Student o = mySqlSession.selectOne("com.example.testlhf.dao.StudentMapper.selectByPoOrMap", studentPo);
//        Student oo = mySqlSession.selectOne("com.example.testlhf.dao.StudentMapper.selectByPoOrMap", map);
//        System.out.println(o);
//        System.out.println(oo);

//        long start = System.currentTimeMillis();
//        for (int i = 0; i < 20; i++) {
//            Student student = new Student(4, "student4", 30);
//            studentMapper.insert(student);
//        }
//        long end = System.currentTimeMillis();
//        System.out.println("SIMPLE模式添加10000条数据，simple 耗时为" + (end - start) + "毫秒");

//        System.out.println("开始batch模式===========================");
//        long start1 = System.currentTimeMillis();
//        for (int i = 0; i < 20; i++) {
//            Student student = new Student(4, "student" + i, 30, LocalDate.now(), LocalDateTime.now(), LocalDateTime.now());
//            myMapper.insert(student);
//        }
//        long end1 = System.currentTimeMillis();
//        System.out.println("BATCH模式添加" + 20 + "条数据，batch耗时为" + (end1 - start1) + "毫秒");


    }

    @Override
    public int insertOrUpdateWithMap(Map<String, Object> map) {
        return studentMapper.insertOrUpdateWithMap(map);
    }

    @Override
    public int insertOrUpdateWithEntity(Student student) {
        return studentMapper.insertOrUpdateWithEntity(student);
    }

    @Override
    public void loadData(String dataPath) {
        LoadDataAdapter adapter = getAdapter(dataPath);
        adapter.handler(dataPath);
    }

    private LoadDataAdapter getAdapter(String dataPath) {
        for (LoadDataAdapter loadDataAdapter : adapterList) {
            if (loadDataAdapter.support(dataPath)) {
                return loadDataAdapter;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setId(1);
        Student student2 = new Student();
        student2.setId(2);
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Integer> ids = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.forEach(e -> ids.add(e.getId()));
        System.out.println(ids.toString());
    }
}
