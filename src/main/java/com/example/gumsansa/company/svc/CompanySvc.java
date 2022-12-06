package com.example.gumsansa.company.svc;

import com.example.gumsansa.company.dto.req.CompanyReadReqDto;
import com.example.gumsansa.company.dto.res.CompanyReadListResDto;

public interface CompanySvc {

    CompanyReadListResDto selectCompanyList(CompanyReadReqDto companyReadReqDto);
}
