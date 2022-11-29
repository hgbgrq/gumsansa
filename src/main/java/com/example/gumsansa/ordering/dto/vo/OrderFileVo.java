package com.example.gumsansa.ordering.dto.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name="orderFile")
public class OrderFileVo {

    @Id
    private Long orderFileId;

    private String crtUsrId;

    private String crtDttm;

    private String orderFileNm;

    private String filePath;
}
