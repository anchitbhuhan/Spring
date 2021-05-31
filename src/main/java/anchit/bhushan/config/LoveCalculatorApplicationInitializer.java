package anchit.bhushan.config;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


//public class LoveCalculatorApplicationInitializer implements WebApplicationInitializer
//{
//
//
//    @Override
//    public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {
//
//        AnnotationConfigWebApplicationContext webcontext = new AnnotationConfigWebApplicationContext();
//        webcontext.register(AppConfig.class);
//
//        //Creating a dispatcher servlet(Front Controller)
//        DispatcherServlet dispatcherServlet = new DispatcherServlet(webcontext);
//
//        //Adding dispatcher servlet to servlet context
//         ServletRegistration.Dynamic sd = servletContext.addServlet("dispatcher", dispatcherServlet);
//
//
//        //Url Handler by front Controller(Dispatcher)
//        sd.setLoadOnStartup(1);
//        sd.addMapping("/mywebsite.com/*");
//
//
//    }
public class LoveCalculatorApplicationInitializer extends
        AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {

        Class classes[] = {AppConfig.class};
        return classes;
    }

    @Override
    protected String[] getServletMappings() {

        String[] arr = {"/lovecalculator.com/*"};
        return arr;
    }

}