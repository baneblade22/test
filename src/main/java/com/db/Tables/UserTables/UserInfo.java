/**
 * Информация о персональных сотрудниках
 */
package com.db.Tables.UserTables;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class UserInfo {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;

    @OneToMany
    private Set<Account> accounts;

    private String surname;     //Ф
    private String name;        //И
    private String patronymic;  //О
    private Date birthday;
    private String uniqueNumber; //Уникальный табельный номер пользователя

}
