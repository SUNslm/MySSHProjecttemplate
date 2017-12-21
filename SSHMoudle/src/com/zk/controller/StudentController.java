package com.zk.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.zk.bean.Studenttb;
import com.zk.service.StudentService;
import com.zk.service.StudentServiceImpl;
import net.sf.json.JSONObject;

/**
 * Created by Administrator on 2017/12/20.
 */
public class StudentController extends ActionSupport {
    private String sname;
    private String sex;
    private String jsonStr;

    //等待IOC注入
    private StudentService studentService;

    public String save(){
        Studenttb studenttb = new Studenttb();
        studenttb.setSname(sname);
        studenttb.setSex(sex);

        studentService.saveServiceStudent(studenttb);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("result","ok");

        jsonStr = jsonObject.toString();

        return "success";
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getJsonStr() {
        return jsonStr;
    }

    public void setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
    }
}
