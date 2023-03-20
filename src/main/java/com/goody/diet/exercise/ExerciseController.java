package com.goody.diet.exercise;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.goody.diet.util.Pager;

@Controller
@RequestMapping(value="/exercise/*")
public class ExerciseController {
	@Autowired
	private ExerciseService exerciseService;
	
	//list //routine
	@GetMapping("routine")
	public ModelAndView getExerciseList() throws Exception{
		ModelAndView mv = new ModelAndView();
		
		List<ExerciseDTO> ar = exerciseService.getExerciseList();
		
		mv.setViewName("exercise/routine");
		mv.addObject("routine", ar);
		
		return mv;
	}
	
	
	
	@GetMapping("video")
	public ModelAndView getExerciseVideo(ModelAndView mv, ExerciseDTO exerciseDTO) throws Exception {
		exerciseDTO = exerciseService.getExerciseVideo(exerciseDTO);
		
		mv.setViewName("exercise/video");
		mv.addObject("dto", exerciseDTO);
		return mv;
	}
	
		
	//detail
	@GetMapping("body")
	public ModelAndView getExerciseBody() throws Exception {
		ModelAndView mv = new ModelAndView();
		
		
		mv.setViewName("exercise/body");
		
		return mv;
	}
	
	@GetMapping("body2")
	public ModelAndView getExerciseBody(ModelAndView mv) throws Exception {
		
		
		
		mv.setViewName("exercise/body2");
		
		return mv;
	}

}

//	@PostMapping("video")
//	public ModelAndView getExerciseVideo(ModelAndView mv) throws Exception {
//		mv.setViewName("exercise/video");
//		return mv;
//	}