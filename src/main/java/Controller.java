package hello;
package Hallo;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import hallo:

@RestController
public class Controller {

    @RequestMapping("/melden")
	public Meldung melden(@RequestParam(value="nr", defaultValue="42") String nr,
			@RequestParam(value="name", defaultValue="beispieltext") String name,
                        @RequestParam(value="frau", defaultValue="true") boolean frau,
                        @RequestParam(value="alter", defaultValue="20") int alter,
                        @RequestParam(value="gewicht", defaultValue="42") double gewicht,
                        @RequestParam(value="grosse", defaultValue="162") double grosse,
			@RequestParam(value="kommmentar", defaultValue="beispieltext") String kommentar) {
    	
    	
    	
    	
    	
    	 Date date = new Date();
    	 SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss dd.MM.yyyy");
    	 String format = simpleDateFormat.format(date);
		System.out.println("EingangsDate:" +format);
    	 
    	 
}
