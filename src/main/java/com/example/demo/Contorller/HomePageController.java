package com.example.demo.Contorller;

import com.example.demo.Domain.JobSeeker;
import com.example.demo.Service.JobSeeker.JobSeekerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class HomePageController {

    @Autowired
    JobSeekerService jobSeeker;

    @RequestMapping("/")
    public ModelAndView index(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("ctx", request.getContextPath());
        JobSeeker job = jobSeeker.findByName("胡毅涛");
        //时间戳转化为Sting或Date
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Long time = new Long(445555555);
//        String d = format.format(time);
//        Date date = format.parse(d);
//        System.out.println("Format To String(Date):" + d);
//        System.out.println("Format To Date:" + date);
        mv.setViewName("index");
        mv.addObject("jobSeeker", job);
        return mv;
    }

    public static int getAge(Date birthDate) {
        if (birthDate == null)
            throw new
                    RuntimeException("出生日期不能为null");
        int age = 0;
        Date now = new Date();
        SimpleDateFormat format_y = new SimpleDateFormat("yyyy");
        SimpleDateFormat format_M = new SimpleDateFormat("MM");
        String birth_year = format_y.format(birthDate);
        String this_year = format_y.format(now);
        String birth_month = format_M.format(birthDate);
        String this_month = format_M.format(now);
        // 初步，估算
        age = Integer.parseInt(this_year) - Integer.parseInt(birth_year);

        // 如果未到出生月份，则age - 1
        if (this_month.compareTo(birth_month) < 0)
            age -= 1;
        if (age < 0)
            age = 0;
        return age;
    }


}
