package dev.dashboard.bankconnect.transfer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TransferController {

     @GetMapping("/process")
     @ResponseBody
     public String processing(){
        return "Processing...";
     }
}
