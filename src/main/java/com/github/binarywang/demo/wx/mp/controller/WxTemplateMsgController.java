package com.github.binarywang.demo.wx.mp.controller;

import lombok.AllArgsConstructor;
import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.template.WxMpTemplateData;
import me.chanjar.weixin.mp.bean.template.WxMpTemplateMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.MalformedURLException;

/**
 * @author qq
 * @date 2019/7/5
 */
@AllArgsConstructor
@RestController
@RequestMapping("/wx/msg/{appid}")
public class WxTemplateMsgController {

    private final WxMpService wxService;


    @GetMapping("/test")
    public String menuCreateSample(@PathVariable String appid) throws WxErrorException, MalformedURLException {
        this.wxService.switchover(appid);
        WxMpTemplateMessage msg = new WxMpTemplateMessage();
        msg.setTemplateId("V2a8G3DYe5wW0CQhR0F8yrHURP946Y_tdadMB3zlHMU");
        msg.setToUser("o9qv_5-hjdOcezMDw3hTacnCCQFM");
        msg.addData(new WxMpTemplateData("name", "Lsep", "#d80b0b"));
        return this.wxService.getTemplateMsgService().sendTemplateMsg(msg);
    }

}
