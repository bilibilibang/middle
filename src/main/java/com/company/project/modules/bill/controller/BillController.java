package com.company.project.modules.bill.controller;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: XQ
 * Date: 2018/7/18
 * Description:
 */
@RequestMapping("/bill")
@RestController
public class BillController {

    @GetMapping("/list")
    public Result test() {
        return ResultGenerator.genSuccessResult("success");
    }

}
