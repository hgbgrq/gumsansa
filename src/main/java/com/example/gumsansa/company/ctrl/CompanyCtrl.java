package com.example.gumsansa.company.ctrl;

import com.example.gumsansa.company.dto.req.CompanyReadReqDto;
import com.example.gumsansa.company.dto.res.CompanyReadListResDto;
import com.example.gumsansa.company.svc.CompanySvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/company")
public class CompanyCtrl {

    @Autowired
    CompanySvc companySvc;
    @GetMapping
    public ResponseEntity<CompanyReadListResDto> getCompanyList(CompanyReadReqDto companyReadReqDto){
        CompanyReadListResDto result = companySvc.selectCompanyList(companyReadReqDto);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }


}
