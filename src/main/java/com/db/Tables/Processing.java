/**
 * Информация обо всех обработках, которые запускались
 * в системе (какой пользователь инициировал обработку,
 * какой сорт сои, дата запуска и статус обработки
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
public class    Processing {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Date date; // Дата запуска обработки данных

    @ManyToOne
    private CultivarCard cultivarId;

    @ManyToOne
    private Account account; // Пользователь, который инициировал запуск обработки

    @ManyToOne
    private ProcessingStatus status; // ID статуса обработки данных

    private String annotationType;

}
