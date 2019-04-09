
package hello;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HtmlController {

    @RequestMapping("/")
    public String zeigeStartseite(Model model) {
        // Template index.html aufrufen
        return "index";
    }

    @RequestMapping("/Calorierechner/")
    public String zeigeCalorierechner(Model model) {
       // TODO: Daten einlesen und in "model" ablegen, damit sie im Template zur Verfügung stehen
       String MeldungsInfo = "";
      Meldung meldung = new Meldung();
      Meldung.MeldungObject(MeldungsInfo);

       // Template fehlerservice.html aufrufen
       return "Calorierechner";
    }

}