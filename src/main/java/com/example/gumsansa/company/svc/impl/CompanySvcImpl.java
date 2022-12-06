package com.example.gumsansa.company.svc.impl;

import com.example.gumsansa.company.dto.req.CompanyReadReqDto;
import com.example.gumsansa.company.dto.res.CompanyReadListResDto;
import com.example.gumsansa.company.svc.CompanySvc;
import org.springframework.stereotype.Service;

@Service
public class CompanySvcImpl implements CompanySvc {
    @Override
    public CompanyReadListResDto selectCompanyList(CompanyReadReqDto companyReadReqDto) {
        return null;
    }
}
