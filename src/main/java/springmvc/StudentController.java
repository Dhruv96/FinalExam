package springmvc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;


@RequestMapping
@SessionAttributes("students")
@Controller
public class StudentController {

    StudentService studentService = new StudentService();

    @RequestMapping(value = "/records", method = RequestMethod.GET)
    public String showRecords(ModelMap model) throws SQLException, ClassNotFoundException {
        List<StudentData> students = studentService.display();
        model.put("students",students);
        return "records.jsp";
    }

    @RequestMapping(value ="/delete-student", method = RequestMethod.GET)
    public String deleteStudent(ModelMap model, @RequestParam String id) throws SQLException, ClassNotFoundException {
        studentService.delete(id);
        model.clear();
        return "redirect:/records.jsp";
    }

    @RequestMapping(value ="/update-student", method = RequestMethod.GET)
    public String updateStudent(ModelMap model, @RequestParam String id, String name, Double gpa) throws SQLException, ClassNotFoundException {
        studentService.update(id,name, gpa);
        model.clear();
        return "redirect:/records.jsp";
    }



}
