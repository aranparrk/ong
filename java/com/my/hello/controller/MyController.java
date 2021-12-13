package com.my.hello.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.my.hello.vo.MyVo;

@RestController
@RequestMapping("/hello")
public class MyController {

	@RequestMapping("/list")
	@ResponseBody
	public ArrayList<MyVo> hello() {
		MyVo vo1 = new MyVo();
		vo1.setSeq(1);
		vo1.setTypeCd("001");
		vo1.setContent("콘텐츠1");
		
		MyVo vo2 = new MyVo();
		vo2.setSeq(2);
		vo2.setTypeCd("001");
		vo2.setContent("콘텐츠2");
		
		MyVo vo3 = new MyVo();
		vo3.setSeq(3);
		vo3.setTypeCd("003");
		vo3.setContent("콘텐츠3");
		
		MyVo vo4 = new MyVo();
		vo4.setSeq(4);
		vo4.setTypeCd("001");
		vo4.setContent("콘텐츠4");
		
		ArrayList<MyVo> list = new ArrayList<MyVo>();
		
		list.add(vo1);
		list.add(vo2);
		list.add(vo3);
		list.add(vo4);
		
		return list;
	}
	
	@RequestMapping("/save")
	public void jsonSave() {
		ArrayList<MyVo> list = new ArrayList<MyVo>();
		
		list = hello();
		ObjectMapper mapper = new ObjectMapper();
		try {
			String jsonStr = mapper.writeValueAsString(list);
			System.out.println(jsonStr);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping("/list2")
	@ResponseBody
	public MyVo jsonClick(MyVo json) {
		System.out.println(json.getContent());
		//System.out.println(json);
		return json;
	}
	
}
