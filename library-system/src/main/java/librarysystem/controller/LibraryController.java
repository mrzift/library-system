package librarysystem.controller;

import librarysystem.model.Books;
import librarysystem.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class LibraryController {

    @Autowired
    private LibraryService libraryService;

    // Retrieve all books
    @RequestMapping("/")
    public String viewHomePage(ModelMap model){
        model.addAttribute("listBooks", libraryService.getAllBooks());
        return "index";
    }
    @RequestMapping("/showNewDataForm")
    public String showNewDataForm(Model model) {
        Books books = new Books();
        model.addAttribute("books", books);
        return "newdataform";
    }


    @PostMapping("/saveData")
    public String saveData(@ModelAttribute("books") Books books) {
        libraryService.addData(books);
        return "redirect:/";  // redirecting to the homepage.
    }


    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable( value = "id") long id, Model model) {

        Books books = libraryService.getDataById(id);

        model.addAttribute("books", books);
        return "updatedatabase";
    }

}
