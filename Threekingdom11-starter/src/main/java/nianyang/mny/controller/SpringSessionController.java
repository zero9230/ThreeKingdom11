package nianyang.mny.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sikou
 * @date 2021/02/05
 */
@RestController
@RequestMapping("/session")
public class SpringSessionController {
      Log log= LogFactory.getLog(SpringSessionController.class);

    @ResponseBody
    @RequestMapping("/putsession.html")
      public  String putSession(HttpServletRequest request){

          HttpSession session=request.getSession();
          log.info(session.getClass());
          log.info(session.getId());
          String name="xiandafu";
          session.setAttribute("user",name);


          return "hey,"+name;
      }

}
