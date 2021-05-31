package anchit.bhushan.controller;


import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import anchit.bhushan.propertyeditor.CurrencyEditor;
import anchit.bhushan.api.Bill;

@Controller
public class BillController {

    @RequestMapping("/bill")
    public String billprocessing(@ModelAttribute("bill") Bill bill) {

        return "bill";
    }


    @RequestMapping("/bill-process")
    public String processBill(@Valid @ModelAttribute("bill") Bill bill,
                              BindingResult result) {

        if (result.hasErrors()) {
            List<ObjectError> error = result.getAllErrors();
            for (ObjectError o : error)
                System.out.println(o);
            return "bill";
        }

        return "bill-processed";
    }


    @InitBinder
    public void initBinder(WebDataBinder binder) {


        //Date Formatter using inbuilt property editor
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        CustomDateEditor customDateEditor = new CustomDateEditor(dateformat, true);
        binder.registerCustomEditor(Date.class, "date", customDateEditor);


        //Amount custom editor
        NumberFormat numberFormat = new DecimalFormat("##,###.00");
        CustomNumberEditor customNumberEditor = new CustomNumberEditor
                (BigDecimal.class, numberFormat, true);
        binder.registerCustomEditor(BigDecimal.class, "amount", customNumberEditor);


        //Custom Property Editor
        CurrencyEditor currencyEditor = new CurrencyEditor();
        binder.registerCustomEditor(Currency.class, "currency", currencyEditor);


        //Adding formatter from binder
        // binder.addCustomFormatter(new CreditCardFormatter());


        //Custom Property Editor
        //CreditCardPropertyEditor creditCardEditor = new CreditCardPropertyEditor();
        //binder.registerCustomEditor(CreditCard.class, "creditCard", creditCardEditor);


    }

}
