package com.starrk.dev.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;
@Data
@Entity
public class Basic {
    @Column
    private Date createTime;
    @Column
    private Date editTime;
}
