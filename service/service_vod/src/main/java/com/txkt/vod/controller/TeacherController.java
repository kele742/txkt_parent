package com.txkt.vod.controller;


import com.txkt.ggkt.model.vod.Teacher;
import com.txkt.result.Result;
import com.txkt.vod.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author xxy
 * @since 2023-04-19
 */

@RestController
//返回两个，一个是Controller(创建对象交给spring管理),一个是ResponseBody(返回数据，json)
@RequestMapping("/admin/vod/teacher")
public class TeacherController {

    @Resource
    private TeacherService teacherService;

    //http://localhost:8301/admin/vod/teacher/findAll
    //1.查询所有讲师
//    @GetMapping("findAll")
//    public List<Teacher> findAllTeacher(){
//        //调用service方法
//        List<Teacher> list = teacherService.list();
//        return list;
//    }
    @GetMapping("findAll")
    public Result findAllTeacher(){
        //调用service方法
        List<Teacher> list = teacherService.list();
        return Result.ok(list).message("查询数据成功");
    }

    //remove/1
    //2、逻辑删除讲师
    @DeleteMapping("remove/{id}")
    public Result removeTeacher(@PathVariable Long id){
        boolean isSuccess = teacherService.removeById(id);
        if(isSuccess){
            return Result.ok(null);
        }else {
            return Result.fail(null);
        }
    }
}

