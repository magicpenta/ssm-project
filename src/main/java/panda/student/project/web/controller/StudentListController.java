package panda.student.project.web.controller;

import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.github.miemiedev.mybatis.paginator.domain.Paginator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import panda.student.project.meta.BaseQo;
import panda.student.project.meta.JqgridPageReq;
import panda.student.project.meta.JqgridPageResp;
import panda.student.project.meta.Student;
import panda.student.project.service.StudentInfoService;

@Controller
@RequestMapping(value = "/student")
public class StudentListController {

	private static Logger logger = Logger.getLogger(StudentListController.class);

	@Autowired
	private StudentInfoService studentInfoService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String studentList() {
		return "student-list";
	}

	@RequestMapping(value = "/query-list", method = RequestMethod.POST)
	@ResponseBody
	public Object queryStudentList(JqgridPageReq<Student> req, BaseQo qo) {
		JqgridPageResp<Student> resp = new JqgridPageResp<Student>();
		// 获得当前页码
		qo.setPageNumber(req.getPage());
		// 获得每页记录数
		qo.setPageSize(req.getRows());
		// 查询学生信息记录
		PageList<Student> studentList = studentInfoService.queryStudentList(qo);
		// 获取分页对象
		Paginator paginator = studentList.getPaginator();
		// 返回当前页码
		resp.setPage(paginator.getPage());
		// 返回总记录数
		resp.setRecords(paginator.getTotalCount());
		// 返回总页数
		resp.setTotal(paginator.getTotalPages());
		// 返回查询数据
		resp.setRows(studentList);
		return resp;
	}
}
