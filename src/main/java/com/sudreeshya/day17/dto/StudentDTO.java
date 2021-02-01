package com.sudreeshya.day17.dto;

import lombok.Builder;
import lombok.Getter;

/**
 *
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
@Builder
@Getter
public class StudentDTO {

    private String firstname;
    private String lastname;
    private String contactNo;
    private String address;
    private Long courseId;
    
}
