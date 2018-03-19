package com.test.controller;

import com.test.entity.User;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 * Created by 何冠雄 on 2018/2/12.
 */
@Controller
public class ViewController {

    @RequestMapping("/view/test1")
    @ResponseBody
    public View test1(){
        return new JstlView("/WEB-INF/index.jsp");
    }

    @RequestMapping("/view/test2")
    public View test2(final ModelMap model){
        List<User> list = new ArrayList<>();
        User u = new User();
        u.setName("里斯");
        u.setAge(18);
        u.setBirthday(new Date());
        u.setHobby(Arrays.asList(1,2,3));
        User u2 = new User();
        u2.setName("里斯2");
        u2.setAge(22);
        u2.setBirthday(new Date());
        u2.setHobby(Arrays.asList(2,3));
        list.add(u);
        list.add(u2);
        model.addAttribute("list",list);
        return new AbstractXlsView() {
            @Override
            protected void buildExcelDocument(Map<String, Object> map, Workbook workbook, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
                // workbook 是工作簿
                Sheet sheet = workbook.createSheet("学生工作表"); // 创建工作表

                List<User> list = (List<User>) model.get("list");
                int i = 0;
                for (User user : list) {
                    Row row = sheet.createRow(i++); // 创建一行
                    row.createCell(0).setCellValue(user.getName());
                    row.createCell(1).setCellValue(user.getAge());
                }

            }
        };
    }
}
