package com.poly.controller;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DoXoSoController {

	String[] giaidb, giai1, giai2, giai3, giai4, giai5, giai6, giai7, giai8;
	Element giaidbl, giai1l, giai2l, giai3l, giai4l, giai5l, giai6l, giai7l, giai8l;
	String specialCharacters = " !#$%&'()*+,-./:;<=>?@[]^_`{|}~";

	@GetMapping("/getKQSX")
	private String getKQSX(@RequestParam("ngay") String ngay, @RequestParam("userNumber") String userNumber,
			Model model) {
		String link;
		try {

			// checkNumber
			if (!isNumber(userNumber)) {
				model.addAttribute("error", "Vui lòng nhập số cần dò!");
				return "index";
			}
			if (userNumber.length() < 6 || userNumber.length() > 6) {
				model.addAttribute("error", "Vui lòng nhập đủ 6 chữ số!");
				return "index";
			}

			for (int i = 0; i < userNumber.length(); i++) {
				char ch = userNumber.charAt(i);
				if (specialCharacters.contains(Character.toString(ch))) {
					model.addAttribute("error", "Sai định dạng!");
					return "index";
				}
			}

			// Lấy dữ liệu xổ số
			if (ngay.length() == 0) {
				link = "http://www.minhngoc.com.vn/getkqxs/tp-hcm.js";
			} else {
				link = "http://www.minhngoc.com.vn/getkqxs/tp-hcm" + "/" + ngay + ".js";
			}
			Document doc = Jsoup.connect(link).timeout(5000).get();

			// Lọc và tách theo classname
			giaidbl = doc.getElementsByClass("giaidb").first();
			giai1l = doc.getElementsByClass("giai1").first();
			giai2l = doc.getElementsByClass("giai2").first();
			giai3l = doc.getElementsByClass("giai3").first();
			giai4l = doc.getElementsByClass("giai4").first();
			giai5l = doc.getElementsByClass("giai5").first();
			giai6l = doc.getElementsByClass("giai6").first();
			giai7l = doc.getElementsByClass("giai7").first();
			giai8l = doc.getElementsByClass("giai8").first();

			// Xóa khoảng trắng và chuyển chuỗi về mảng
			giaidb = removeSpace(giaidbl.ownText()).split("\\-");
			giai1 = removeSpace(giai1l.ownText()).split("\\-");
			giai2 = removeSpace(giai2l.ownText()).split("\\-");
			giai3 = removeSpace(giai3l.ownText()).split("\\-");
			giai4 = removeSpace(giai4l.ownText()).split("\\-");
			giai5 = removeSpace(giai5l.ownText()).split("\\-");
			giai6 = removeSpace(giai6l.ownText()).split("\\-");
			giai7 = removeSpace(giai7l.ownText()).split("\\-");
			giai8 = removeSpace(giai8l.ownText()).split("\\-");
			
			model.addAttribute("ngay", ngay);
			
			// kiem tra ket qua
			for (String item : giaidb) {
				if (item.trim().equalsIgnoreCase(userNumber)) {
					model.addAttribute("message", "Chúc mừng bạn đã trúng giải DB " + "-" + userNumber + "-");
					return "index";
				}
			}
			for (String item : giai1) {
				if (item.trim().equalsIgnoreCase(userNumber.substring(1))) {
					model.addAttribute("message", "Chúc mừng bạn đã trúng giải 1 " + "-" + userNumber + "-");
					return "index";
				}
			}
			for (String item : giai2) {
				if (item.trim().equalsIgnoreCase(userNumber.substring(1))) {
					model.addAttribute("message", "Chúc mừng bạn đã trúng giải 2 " + "-" + userNumber + "-");
					return "index";
				}
			}
			for (String item : giai3) {
				if (item.trim().equalsIgnoreCase(userNumber.substring(1))) {
					model.addAttribute("message", "Chúc mừng bạn đã trúng giải 3 " + "-" + userNumber + "-");
					return "index";
				}
			}
			for (String item : giai4) {
				if (item.trim().equalsIgnoreCase(userNumber.substring(1))) {
					model.addAttribute("message", "Chúc mừng bạn đã trúng giải 4 " + "-" + userNumber + "-");
					return "index";
				}
			}
			for (String item : giai5) {
				if (item.trim().equalsIgnoreCase(userNumber.substring(2))) {
					model.addAttribute("message", "Chúc mừng bạn đã trúng giải 5 " + "-" + userNumber + "-");
					return "index";
				}
			}
			for (String item : giai6) {
				if (item.trim().equalsIgnoreCase(userNumber.substring(2))) {
					model.addAttribute("message", "Chúc mừng bạn đã trúng giải 6 " + "-" + userNumber + "-");
					return "index";
				}
			}
			for (String item : giai7) {
				if (item.trim().equalsIgnoreCase(userNumber.substring(3))) {
					model.addAttribute("message", "Chúc mừng bạn đã trúng giải 7 " + "-" + userNumber + "-");
					return "index";
				}
			}
			for (String item : giai8) {
				if (item.trim().equalsIgnoreCase(userNumber.substring(4))) {
					model.addAttribute("message", "Chúc mừng bạn đã trúng giải 8 " + "-" + userNumber + "-");
					return "index";
				}
			}
			model.addAttribute("message", "Rất tiếc, số của bạn không trúng giải nào " + "-" + userNumber + "-");

		} catch (IOException e) {
			model.addAttribute("error", "Xảy ra lỗi khi thực hiện!");
			e.printStackTrace();
		}
		
		return "index";
	}

	public Boolean isNumber(String str) {
		// Hàm kiểm tra dữ liệu phải là số
		return str.matches("-?\\d+(\\.\\d+)?");
	}

	public static String removeSpace(String string) {
		// Hàm xóa khoảng trắng
		string = string.trim();
		string = string.replaceAll(" ", "");
		return string;
	}

}
