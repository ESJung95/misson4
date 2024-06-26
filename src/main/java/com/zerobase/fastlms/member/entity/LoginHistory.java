package com.zerobase.fastlms.member.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class LoginHistory {

    @Id
    private Long id;
    private String userId;
    private LocalDateTime loginDate;
    private String loginIp;
    private  boolean userAgent;

}
