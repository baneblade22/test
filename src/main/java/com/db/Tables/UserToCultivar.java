/**
 * Информация о том, кто является куратором сорта сои
 */
package com.db.Tables;

import com.db.Tables.UserTables.Account;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
public class UserToCultivar {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    private Account accountId;

    @ManyToOne
    private CultivarCard cultivarId;

    private Date updateDate; // Дата обновления информации
}
