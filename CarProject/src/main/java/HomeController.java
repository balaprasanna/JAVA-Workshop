

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.project.ca.model.LeaveForm;
import com.project.ca.service.ManageLeaveService;
import com.project.ca.service.StaffService;

@Controller
public class HomeController {
	
	@Autowired
	   private StaffService soukrce;
	
	
	  // private DeleteRecordService DeleRec;
	  
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		//String name = source.getstaffid("s001");
		String formattedDate = dateFormat.format(date);
	 
		//model.addAttribute("name", name );
		String name= soukrce.getstaffid("s003");
		model.addAttribute("staffname",name);
        
		LeaveForm record=soukrce.findRecordbyid(3);
		model.addAttribute("leaveRecord",record);
		
		return "home";
	}
//	
//	@RequestMapping(value="/delete/{leaveformid}",method=RequestMethod.GET)
//	public ModelAndView deleteRecord(@PathVariable Integer leaveformid,
//			final RedirectAttributes redirectAtt){
//			ModelAndView mav=new ModelAndView("update_leave");		
//			LeaveForm deleLeave=soukrce.delete(leaveformid);
//			String message="The Record has been removed successfully";
//			redirectAtt.addFlashAttribute("message",message);
//			return mav;
//	}
	
//	@RequestMapping(value="/ca/student/delete/{leaveformid}",method=RequestMethod.GET)
//	public String test(@PathVariable Integer leaveformid,
//			Model model){
//					
//			LeaveForm deleLeave=soukrce.delete(leaveformid);
//			String message="The Record has been removed successfully";
//			model.addAttribute("message", message);
//			
//			return "home";
//	}
//	
//	@RequestMapping(value="/ca/student/update/{leaveformid}",method=RequestMethod.GET)
//	public String update(@PathVariable Integer leaveformid,Model model){
//		
//		LeaveForm updtLeave=soukrce.findRecordbyid(leaveformid);
//		model.addAttribute("update",updtLeave);
//		return "update_leave";
//	}
//
//	
//	@RequestMapping(value="/ca/student/update/{update}", method=RequestMethod.POST)
//	public ModelAndView updateRecord(@ModelAttribute @Valid LeaveForm update, 
//		 	BindingResult results, final RedirectAttributes rediAtrr){
//		ModelAndView mav=new ModelAndView("update_leave");
//		String message="Updated successfully!";
//				soukrce.update(update);
//		rediAtrr.addFlashAttribute("message",message);
//				return mav;
//	}
//	public ModelAndView updateRecord(@ModelAttribute @Valid LeaveForm updateleave
//			BindingResult result){}
//}
}
