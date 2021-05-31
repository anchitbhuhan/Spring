package anchit.bhushan.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import anchit.bhushan.SpringCustomValidator.EmailSpringValidator;
import anchit.bhushan.SpringCustomValidator.UserNameSpringValidator;
import anchit.bhushan.api.Name;
import anchit.bhushan.api.User;
import anchit.bhushan.propertyeditor.NamePropertyEditor;

@Controller
public class RegistrationController {


    @RequestMapping("/register")
    public String showRegistraionPage(@ModelAttribute("user") User user) {

        return "registration";
    }

    @RequestMapping("/process-registration")
    public String processRegistration(@Valid @ModelAttribute("user")
                                              User user, BindingResult result) {

        if (result.hasErrors()) {
            List<ObjectError> error = result.getAllErrors();
            for (ObjectError o : error)
                System.out.println(o);
            return "registration";
        }
        return "registration-success";
    }


    /**
     * Init Binder is used to do some pre processing work before the control goes to
     * the handler method
     */
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        System.out.println("Init Binder called");

        /*
        * Trims space before an input. If parameter is true and only space then
        * reduce it to null
        * */
        StringTrimmerEditor editor = new StringTrimmerEditor(true);
        binder.registerCustomEditor(String.class, "username", editor);

        StringTrimmerEditor editor2 = new StringTrimmerEditor(true);
        binder.registerCustomEditor(Name.class, "name", editor2);


        //Custom Spring Bean Validator for username
        UserNameSpringValidator validator = new UserNameSpringValidator();
        binder.addValidators(validator);

        //Custom Spring Validation for e-mail
        EmailSpringValidator emailvalidator = new EmailSpringValidator();
        binder.addValidators(emailvalidator);


        NamePropertyEditor namePropertyEditor = new NamePropertyEditor();
        binder.registerCustomEditor(Name.class,"name", namePropertyEditor);


    }
}
