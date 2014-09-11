package hello

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.beans.factory.annotation.Autowired

@RestController
class hellocontroller{
  @RequestMapping(Array("/greeting"))
  def hellouser() : String ={
    return("Hello,World")
    /**return g*/
  }
}

