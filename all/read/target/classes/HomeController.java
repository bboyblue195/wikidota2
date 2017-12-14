import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;

@Controller
public class HomeController {
    String [] CurnextLine;
    String [] FutnextLine;
    String curdate;
    String curtype;
    String cursys;
    String curdes;
    String futdate;
    String futtype;
    String futsys;
    String futdes;

    String currentString;

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);  

    @RequestMapping(value="/c_Outage", method=RequestMethod.POST)

    public String writecurrent(@RequestParam String date, String type, String system, String description, Locale locale, HttpSession session,  @ModelAttribute("currentOutage") CurrentData cd, 
            Model model) throws Exception{

        String csvFilename1 = "C:/temp/csv/curdata.csv";

        CSVWriter writer1 = new CSVWriter(new FileWriter(csvFilename1, true));

        String [] record1 = {date,type,system,description};

        writer1.writeNext(record1);         

        writer1.close();

        return "currentO";

    }

    @RequestMapping(value="/f_Outage", method=RequestMethod.POST)

    public String writefuture(@RequestParam String datefuture, String typefuture, String systemfuture, String descriptionfuture, Locale locale, HttpSession session,  @ModelAttribute("futureOutage") CurrentData cd, 
            Model model) throws Exception{
        //CurrentData cd2 = new CurrentData();          

        String csvFilename2 = "C:/temp/csv/futdata.csv";

        CSVWriter writer2 = new CSVWriter(new FileWriter(csvFilename2, true));

        String [] record2 = {datefuture,typefuture,systemfuture,descriptionfuture};

        writer2.writeNext(record2);             

        writer2.close();

        return "futureO";

    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model, HttpServletRequest req) throws Exception {
        logger.info("Welcome home! The client locale is {}.", locale);

        String csvFilename1 = "C:/temp/csv/curdata.csv";
        CSVReader reader1 = new CSVReader(new FileReader(csvFilename1));     

        while ((CurnextLine = reader1.readNext()) != null) {
            currentString += CurnextLine[0] + "\t" + CurnextLine[1] + "\t" + CurnextLine[2] + "\t" + CurnextLine[3] + "\t" + "|"; //appending each data each time the while loop loops
            curdate = CurnextLine[0];
            curtype = CurnextLine[1];
            cursys = CurnextLine[2];
            curdes = CurnextLine[3];
        }
        model.addAttribute("currentString", currentString); //This is the long appended string which is to be split in the jsp page by the delimiter '|'

        model.addAttribute("curdate", curdate);
        model.addAttribute("curtype", curtype);
        model.addAttribute("cursys", cursys);
        model.addAttribute("curdes", curdes);

        String csvFilename2 = "C:/temp/csv/futdata.csv";
        CSVReader reader2 = new CSVReader(new FileReader(csvFilename2));

        while ((FutnextLine = reader2.readNext()) != null) {

            futdate = FutnextLine[0];
            futtype = FutnextLine[1];
            futsys = FutnextLine[2];
            futdes = FutnextLine[3];
        }

        model.addAttribute("futdate", futdate);
        model.addAttribute("futtype", futtype);
        model.addAttribute("futsys", futsys);
        model.addAttribute("futdes", futdes);    

        return "home";
    }   

    @RequestMapping(value = "/c_Outage", method = RequestMethod.GET)
    public String c_outage(HttpSession session, WebRequest request, Model model) {
        return "currentO";
    }

    @RequestMapping(value = "/f_Outage", method = RequestMethod.GET)
    public String f_outage(HttpSession session, WebRequest request, Model model) {
        return "futureO";
    }
}