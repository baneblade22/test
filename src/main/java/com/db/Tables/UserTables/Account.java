package com.db.Tables.UserTables;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
public class Account {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;

    private String login;
    @JsonIgnore
    private String password;

    @ManyToOne
    private UserInfo userInfo;

    private Date createDate;

}
