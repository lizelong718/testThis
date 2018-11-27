package cn.bdqn.controller;
import cn.bdqn.pojo.entry;
import cn.bdqn.service.edocService;
import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author 泽先生
 * @package cn.bdqn.controller
 * @description TODO
 */
@Controller
@RequestMapping("/entry")
public class Edoc {

    Logger logger = Logger.getLogger(Edoc.class);

        @Resource
        private edocService service;
        //查詢所有标签
        @RequestMapping(value = "/select.html")
        public String GetAll(HttpSession session){
            List<entry> list = service.select();
            session.setAttribute("list" ,list);
            return "select";
        }

    @RequestMapping(value = "/GetByName.html",method = RequestMethod.GET)
    public String GetByName(@RequestParam(value = "entry",required = false) String entry, HttpSession session){
        logger.info("==================>"+entry);
        List<entry> list= service.classFen(entry);
        session.setAttribute("list",list);
        return "index";
    }
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    @ResponseBody
    public String deleteEntiy(@RequestParam Integer id){
        if(service.delete(id)>0){
            logger.info("-----------ɾ���ɹ�--------");
        }
        return JSON.toJSONString(id.toString());
    }



        }

