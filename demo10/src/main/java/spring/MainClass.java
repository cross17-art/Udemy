package spring;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainClass {


    @GetMapping("/second")
    public String second_page(){
        return "second_page";
    }
    @GetMapping("/")
    public String first_page(){
        return "index";
    }


    @GetMapping("/showForm")
    public String form_studnent(Model model){
        Student student =new Student();
        model.addAttribute("student",student);
        return "form_student";
    }

    @GetMapping("/processFrom")
    public String processFrom(Model model){
        Student student =new Student();
        model.addAttribute("student",student);
        return "studnet";
    }




}
