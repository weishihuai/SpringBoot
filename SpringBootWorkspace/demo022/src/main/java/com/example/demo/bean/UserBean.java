package com.example.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by wsh on 2017/12/21.
 *
 * @version 1.0
 */
/*@Getter
@Setter
@ToString*/
//@Data 相当于上面三个

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserBean {

    private String name;

    private int age;

    private String address;


}
