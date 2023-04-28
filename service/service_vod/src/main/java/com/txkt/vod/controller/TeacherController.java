package com.txkt.vod.controller;


import com.txkt.vod.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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
}

