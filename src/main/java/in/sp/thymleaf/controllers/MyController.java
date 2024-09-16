package in.sp.thymleaf.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	@GetMapping("/welInd")
	public String openProfilePage(Model model) {
		String name="SATISH PRAJAPATI";
		model.addAttribute("myname", name);
		return "profile";
	}
	@GetMapping("/conditionalPage")
	public String openCondPage(Model model) {
	int no1=10;
	int no2=20;
	model.addAttribute("myno1", no1);
	model.addAttribute("myno2", no2);
		
		return "conditional";
	}
	@GetMapping("/loopingPage")
	public String LoopingPage(Model model) {
		List<Integer> num=new ArrayList<>();
		for(int i=0;i<79;i=i+3) {
			num.add(i);
		}
		model.addAttribute("modelNum", num);
		
		return "looping";
	}

}
