package panda.student.project.dao;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import org.apache.ibatis.annotations.Param;
import panda.student.project.meta.BaseQo;
import panda.student.project.meta.Student;

public interface StudentDao {

	/**
	 * 新增学生信息
	 * @param record
	 * @return
	 */
	int insert(Student record);

	/**
	 * 删除学生信息
	 * @param id
	 * @return
	 */
	int delete(Integer id);

	/**
	 * 更新学生信息
	 * @param record
	 * @return
	 */
	int update(Student record);

	/**
	 * 查询学生列表信息
	 * @return
	 */
	PageList<Student> queryStudentList(@Param("qo")BaseQo qo, PageBounds pgs);
}
