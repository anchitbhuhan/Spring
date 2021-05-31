package anchit.bhushan.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import anchit.bhushan.api.UserInfoDTO;
import anchit.bhushan.service.LCAppService;

@Controller
@SessionAttributes({"userInfo", "loveresult"})
public class LCAppController {

	@Autowired
	private LCAppService LCAppService;

    @RequestMapping("/")
    public String showHomePage(Model model)
    {
    	model.addAttribute("userInfo",new UserInfoDTO());
//    	Cookie[] cookies = request.getCookies();
//    	for(Cookie ck : cookies)
//    	{
//    		if(ck.getName().equals("LCApp.username"))
//    		{
//    			  String username = ck.getValue();
//    			  NameFormatter nameformatter = new NameFormatter();
//    			  Name name= nameformatter.parse(username, null);
//    			  System.out.println(name.toString());
//    			  userInfoDTO.setName(name);
//    		}
//    	}
        return "homepage";
    }

//    @RequestMapping("/new")
//    @ResponseBody
//    public String showHomePage(HttpServletRequest request, @ModelAttribute("abc") String s){
//        System.out.println("Inside new controller");
//
//        System.out.println(s);
//        return s;
//    }

    @RequestMapping("/process-homepage")
    public String showResultPage(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO, 
    		BindingResult result, Model model)
    {

    	
        if(result.hasErrors()){

                List<ObjectError> allErrors = result.getAllErrors();
                for(ObjectError temp : allErrors){
                    System.out.println(temp);
                }
            return "homepage";
        }
        String username = userInfoDTO.getName().toString();
        String crushname = userInfoDTO.getCrushname().toString();
        String loveresult = LCAppService.calculateLove(username,crushname);
        
        
        model.addAttribute("loveresult", loveresult);
        //Session
//        HttpSession session = request.getSession();
//        session.setAttribute("username", userInfoDTO.getName().toString());
//        session.setMaxInactiveInterval(120);
        
        
        
//        //Create a cookie for the username
//        System.out.println("String value is "+userInfoDTO.getName().toString());
//        Cookie cookie =  new Cookie("LCApp.username", userInfoDTO.getName().toString());
//        cookie.setMaxAge(60*60*24);
//        
//        //Add cookie to respopnse object
//        response.addCookie(cookie);
        
        return "result-page";
    }
    
    

    
    
//    @InitBinder
//    public void initBinder(WebDataBinder binder){
//        System.out.println("Init Binder called");
//      
    
//      NamePropertyEditor namePropertyEditor = new NamePropertyEditor();
//      binder.registerCustomEditor(Name.class,namePropertyEditor);
//        
//        
//        
//    }
}
