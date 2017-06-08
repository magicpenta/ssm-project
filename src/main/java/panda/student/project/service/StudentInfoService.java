package panda.student.project.service;

import com.github.miemiedev.mybatis.paginator.domain.PageList;
import panda.student.project.meta.BaseQo;
import panda.student.project.meta.Student;

import java.util.List;

public interface StudentInfoService {

	PageList<Student> queryStudentList(BaseQo qo);
}
