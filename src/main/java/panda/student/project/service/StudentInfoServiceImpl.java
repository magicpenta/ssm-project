package panda.student.project.service;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import panda.student.project.dao.StudentDao;
import panda.student.project.meta.BaseQo;
import panda.student.project.meta.Student;

@Service
public class StudentInfoServiceImpl implements StudentInfoService {

	@Autowired
	private StudentDao studentDao;

	public PageList<Student> queryStudentList(BaseQo qo) {

		PageBounds pgs = new PageBounds(qo.getPageNumber(), qo.getPageSize());
		return studentDao.queryStudentList(qo, pgs);
	}

}
