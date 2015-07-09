package com.wl.shoppingmall.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/controller")
public class ControllerController {
	@RequestMapping("/test")
	@ResponseBody
	public Map<String, Object> testWeb() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "controller");
		return map;
	}
}
